import java.util.Scanner;

public class EX_13 {

    public static void calc(int x) {
        if ( x <= 100) {
            System.out.println(x + "\n");
            calc(x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number to make this one reach one hundred: ");
        int num = scan.nextInt();
        calc(num);
        scan.close();
    }
}

//------------------------------| Código em C |------------------ ------------//

/* #include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void conta (int x);

int main(){
	setlocale(LC_ALL,"Portuguese");
	int num;
	
	printf("Informe um n�mero pra ir dele at� 100:");
	scanf("%d", &num);
	conta(num);
	
	system("pause");
	return 0;
	
}

void conta (int x){
		
	if( x <= 100) {
		printf("%d \n", x);
		conta(x + 1);
		
	}
} */