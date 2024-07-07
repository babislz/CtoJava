import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] names = new String[5];
        float[] values = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the %d%s name: ", i + 1, getOrdinalSuffix(i + 1));
            names[i] = scan.nextLine();

            System.out.printf("Enter the %d%s value to be calculated: ", i + 1, getOrdinalSuffix(i + 1));
            values[i] = scan.nextFloat();
            scan.nextLine();
        }

        System.out.println("___________________________________");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s with the value x2 = %.2f \n", names[i], values[i] * 2);
        }

        scan.close();
    }

    public static String getOrdinalSuffix(int number) {
        int remainder10 = number % 10;
        int remainder100 = number % 100;

        if (remainder10 == 1 && remainder100 != 11) {
            return "st";
        } else if (remainder10 == 2 && remainder100 != 12) {
            return "nd";
        } else if (remainder10 == 3 && remainder100 != 13) {
            return "rd";
        } else {
            return "th";
        }
    }
}

//------------------------------| Código em C |------------------ ------------//

/*
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	char nome[5][30];
	float reais[5];
	int cont = 0;
	
	for(cont = 0;cont < 5; cont++){
		printf("Informe o %d� nome:",cont +1);
		fflush(stdin);
		gets(nome[cont]);
		
		printf("Informe o %d� valor a ser calculado:",cont+1);
		fflush(stdin);
		scanf("%f",&reais[cont]);
		
	}
	
	printf("___________________________________\n");
	for(cont = 0;cont<5;cont++){
		printf("%s com o valor x2 = %.2f \n",nome[cont],reais[cont]*2);
	}
	
	
	
system("pause");
return 0;
} */