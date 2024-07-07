import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    //    System.out.println("What's the first registration number? ");
    //    String reg1 = scan.next();//why??

        System.out.println("What's the first age?");
        int age1 = scan.nextInt();

    //    System.out.println("What is the second registration number? ");
    //    String reg2 = scan.next();//why??

        System.out.println("What's the second age?");
        int age2 = scan.nextInt();

        System.out.println("__________________________________________________");
        System.out.println(age1>age2?"The biggest age informed is " + age1 + " years.":"The biggest age informed is " + age2 + " years.");

        scan.close();
    }
}
    
//------------------------------| Código em C |------------------------------//

//#include<stdio.h>#include<stdlib.h>#include<locale.h>

//int main(){
//	setlocale(LC_ALL,"Portuguese");
//	
//	int mat1,mat2,age1,age2;
//	
//	printf("QUAL A MATRICULA:");
//	fflush(stdin);
//	scanf("%d",&mat1);
//	printf("QUAL A IDADE:");
//	fflush(stdin);
//	scanf("%d",&age1);
//	printf("QUAL A MATRICULA DA OUTRA:");
//	fflush(stdin);
//	scanf("%d",&mat2);
//	printf("QUAL A IDADE DA OUTRA:");
//	fflush(stdin);
//	scanf("%d",&age2);
	
//	printf("\n");
	
//	if(age1 > age2){
//		printf("A MAIOR IDADE INFORMADA FOI %d ANOS.\n",age1);
//	}
//	else{
//		printf("A MAIOR IDADE INFORMADA FOI %d ANOS.\n",age2);
//	}
//	system("pause");
//	return 0;
//}
