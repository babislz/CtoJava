import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a matrícula?");
        String mat = scan.next();

        System.out.println("Qual o valor da mensalidade?");
        float value = scan.nextFloat();

        System.out.println("O aluno " + mat + " paga mensalmente R$:" + value);
        scan.close();
    }
}

//------------------------------| Código em C |------------------------------//

// #include<stdio.h>
// #include<stdlib.h>

// int main(){
// 	int mat;
// 	float value;
	
// 	printf("Qual o Matricula:");
//    	 scanf("%d", &mat);
// 	printf("Qual o valor da mensalidade:");
// 	 scanf("%f", &value);
	 
// 	printf("O aluno %d paga mensalmente R$ %.2f \n",mat, value); 
	
// system("pause");
// return 0;
// }