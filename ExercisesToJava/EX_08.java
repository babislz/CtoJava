import java.util.Scanner;

public class EX_08 {
    public static void main(String[] args) {
        int num_people = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the person's height (in meters):");
        float height = scan.nextFloat();

        while (height > 0) {
            System.out.println("Enter the person's gender? (M) Male (F) Female");
            String gender = scan.next();

            num_people++;

            float idealWeight;
            if (gender.equalsIgnoreCase("M")) {
                idealWeight = (72.7f * height) - 58;
            } else if (gender.equalsIgnoreCase("F")) {
                idealWeight = (62.1f * height) - 44.7f;
            } else {
                System.out.println("Invalid gender input. Please enter 'M' for Male or 'F' for Female.");
                continue;
            }

            System.out.println("\nYour ideal weight is: " + String.format("%.2f", idealWeight) + " Kg\n");
            System.out.println("__________________________________________________\n");

            System.out.println("Enter the person's height (in meters) or 0 to exit:");
            height = scan.nextFloat();
        }

        System.out.println(num_people + " Participants.");
        scan.close();
    }
}


//------------------------------| Código em C |------------------ ------------//

/* #include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int num_pessoas;
	char sexo;
	float alt,resp;
	
	printf("Qual a altura da pessoa? \n");
	fflush(stdin);
	scanf("%f",&alt);
	
	while(alt > 0){
		
	printf("Qual o sexo da pessoa?(M)Homens/(F)Mulheres \n");
	fflush(stdin);
	scanf("%c",&sexo);
	
		num_pessoas = num_pessoas + 1;
		
		if(sexo =='M'){
			resp =(72.7*alt)-58;
		}
		else{
			resp =(62.1*alt)-44.7;
		}
		
	printf(" Seu peso ideal é de: %.2f kilos \n\n\n",resp);
	
	printf("Qual a altura da pessoa? \n");
	fflush(stdin);
	scanf("%f",&alt);
		
	}
	
	printf(" %d participantes. \n \n",num_pessoas);
	
	system("pause");
	return 0;
} */