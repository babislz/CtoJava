public class EX_10 {
    public static void main(String[] args) {
        int[][] mat1 = new int[4][4];
        int value = 1;
        int sum = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                mat1[row][col] = value;
                value = value * 2;

                sum = sum + mat1[row][col];
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("| " + mat1[row][col] + " |");
            }
            System.out.println();
        }

        System.out.println("The sum of the matrix = " + sum + "\n");
    }
}

//------------------------------| Código em C |------------------ ------------//

/* #include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");

	int mat1[4][4];
	int l,c;
	int valor = 1;
	int soma = 0;
	
	for(l = 0; l < 4; l++){
		for(c = 0; c < 4; c++){
		mat1[l][c] = valor;
		valor = valor * 2;

		soma = soma + mat1[l][c];
		}
	}
	
	for(l = 0; l < 4; l++){
		for(c = 0; c < 4; c++){
			printf("| %d |",mat1[l][c]);
		}
		printf("\n");
	}
	
	printf("A soma da matriz = %d\n\n",soma);
	
system("pause");
return 0;
} */