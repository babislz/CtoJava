import java.util.Scanner;

public class Pratica8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a idade do aluno? ");
        int age = sc.nextInt();
        System.out.println("A idade informada foi: " + age + " anos");
        sc.close();
    }
}

//------------------------------| Código em C |------------------------------//

// #include<stdio.h>
// #include<stdlib.h>
// //exercicio 8 aula pr�tica
// int main(){
// 	int age;
	
// 	printf("Qual a idade do aluno:");
// 	scanf("%d", &age);
// 	printf("A idade Informada foi: %d \n", age);
	
// 	system("pause");
// 	return 0;
// }