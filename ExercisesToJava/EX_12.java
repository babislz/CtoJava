import java.util.Scanner;

public class EX_12 {
    public static int sqrd(int x) {
        int sqrdResult;
        sqrdResult = x * x;
        return sqrdResult;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int asw = sqrd(num);

        System.out.println("\n____________________________________\n");
        System.out.println("The square of " + num + " is " + asw);

        scan.close();
    }
}

//------------------------------| Código em C |------------------ ------------//

/* #include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int quad (int x);

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int num, res;
	
	
		printf("Informe um numero: ");
		scanf("%d", &num);
	
		res = quad(num);
	
		printf("O quadrado de %d �: %d \n",num,res);
	
	
	system("pause");
	return 0;
}

int quad (int x){
	int quadrado;
	
	quadrado = x*x;
	return quadrado;
} */