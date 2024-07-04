import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o código: ");
        String code = scan.next();
        System.out.print("\nInsira a idade: ");
        int age = scan.nextInt();
        System.out.print("\nInsira a altura: ");
        float height = scan.nextFloat();
        System.out.print("\nInsira o peso: ");
        float weight = scan.nextFloat();

        scan.close();

        System.out.println("\n___________________________________________\n");
        System.out.println("\nO competidor " + code + " tem " + age + " anos, pesa " + weight + "Kg e tem " + height + "m de altura. \n");
    }
}

//------------------------------| Código em C |------------------------------//

// #include<stdio.h>
// #include<stdlib.h>
// //exercico 10

// int main(){
// 	int code, age;
// 	float height, weight;
	
// 	printf("Qual o codigo:");
// 	 scanf("%d", &code);
// 	printf("Qual o idade:");
//    	 scanf("%d", &age);
// 	printf("Qual o altura:");
// 	 scanf("%f", &height);
// 	printf("Qual o peso:");
// 	 scanf("%f", &weight);
// 	printf("\n");
	
// 	printf("O competidor %d , tem %d anos, pesa %.2f Kg e tem %.2f de altura. \n", code, age, weight,height);
	
// 	system("pause");
// 	return 0;
// }		 
