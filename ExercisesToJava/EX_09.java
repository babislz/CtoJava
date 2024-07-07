import java.util.Scanner;

public class EX_09 {
    static class PropertyData {
        int registrationNumber;
        float propertyTaxValue;
        int monthsDelayed;
        float fineAmount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PropertyData[] properties = new PropertyData[3];
        int calculations = 0;

        for (int i = 0; i < 3; i++) {
            properties[i] = new PropertyData();

            System.out.printf("\nEnter the registration number (%dº property):\n", i + 1);
            properties[i].registrationNumber = scan.nextInt();

            System.out.println("\nEnter the IPTU value:");
            properties[i].propertyTaxValue = scan.nextFloat();

            System.out.println("\nEnter how many months delayed:");
            properties[i].monthsDelayed = scan.nextInt();

            properties[i].fineAmount = 50.00f * properties[i].monthsDelayed;
            calculations++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nRegistration number: %d\nProperty Tax Value: %.2f\nMonths delayed: %d\nFine Amount: %.2f\n\n",
                    properties[i].registrationNumber, properties[i].propertyTaxValue, properties[i].monthsDelayed, properties[i].fineAmount);
        }

        System.out.printf("\nNumber of properties calculated: %d properties.\n\n", calculations);
        scan.close();
    }
}

//------------------------------| Código em C |------------------ ------------//

/* #include<stdio.h>
#include<stdlib.h>
#include<locale.h>

struct imovel_dados{
	int numcad ;
	float valorIPTU ;
	int mesesatrasado;
	float valorMulta;
};

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	struct imovel_dados ap[3];
	int cont,calculos = 0;


	for(cont = 0; cont < 3; cont++){
			
		printf("\nINFOME O NUMERO DE CADASTRO(%d� imovel):\n",cont+1);
		fflush(stdin);
		scanf("%d",&ap[cont].numcad);
		printf("\nINFOME O VALOR DO IPTU:\n");
		fflush(stdin);
		scanf("%f",&ap[cont].valorIPTU);
		printf("\nINFOME QUANTOS MESES ATRASADO:\n");
		fflush(stdin);
		scanf("%d",&ap[cont].mesesatrasado);
		
		ap[cont].valorMulta = 50.00 * ap[cont].mesesatrasado;
		calculos++;

	}
	for(cont = 0;cont<3;cont++){
	printf("\nCADASTRO: %d\nVALOR IPTU: %.2f\nMESES EM ATRASO: %d\nMULTA: %.2f\n\n\n",ap[cont].numcad, ap[cont].valorIPTU, ap[cont].mesesatrasado ,ap[cont].valorMulta);
	
}
	printf("Numero de imoveis calculados: %d imov�is.\n\n",calculos);
	system("pause");
	return 0;
} */