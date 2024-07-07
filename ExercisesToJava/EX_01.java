import java.util.Scanner;

public class EX_01 {

    public static float calculateGrossSalary(float normalHours, float extraHours) {
        float regularPay = normalHours * 12;
        float extraPay = extraHours * 15.50f;
        float grossSalary = regularPay + extraPay;
        return grossSalary;
    }

    public static float calculateNetSalary(float grossSalary) {
        float tax = grossSalary * 0.1f;
        float netSalary = grossSalary - tax;
        return netSalary;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int employeeCount = 1; employeeCount <= 10; employeeCount++) {
            System.out.println("\n_________________________________________\n");
            System.out.println("\nEnter employee code:");
            String code = scan.next();
            
            System.out.println("Enter number of normal hours worked:");
            float normalHours = scan.nextFloat();
            
            System.out.println("Enter number of extra hours worked:");
            float extraHours = scan.nextFloat();
            
            System.out.println("\n_________________________________________\n");
            
            System.out.println("\nCalculating for employee: " + employeeCount);
            
            float grossSalary = calculateGrossSalary(normalHours, extraHours);
            float netSalary = calculateNetSalary(grossSalary);
            displayEmployeeInfo(code, normalHours, extraHours, grossSalary, netSalary);
        }
        
        scan.close();
    }

    public static void displayEmployeeInfo(String code, float normalHours, float extraHours, float grossSalary, float netSalary) {
        System.out.println("Employee " + code + " worked " + normalHours + " regular hours and " + extraHours + " extra hours");
        System.out.println("Gross salary: R$" + grossSalary + " | Net salary: R$" + netSalary);
    }
}


//------------------------------| Código em C |------------------------------//

// #include<stdio.h>
// #include<stdlib.h>
// #include<locale.h>


// float Sal_Bruto(float p_horasn, float p_horase);
// float Sal_Liquido(float p_bruto);
// void mostra(int p_cod,float p_horasn, float p_horase,float p_respbruto,float p_respliquido);

// int main(){
// 		setlocale(LC_ALL,"Portuguese");
		
// 		float horasn = 0, horase = 0, respbruto = 0, respliquido = 0; /*o funcionario pode informar 2,5 de trabalho por exemplo, porisso float*/
// 		int cod = 0, cont = 0;
		
// 		for(cont = 1; cont < 11; cont++){
// 			printf("QUAL SEU CODIGO:");
// 			fflush(stdin);
// 			scanf("%d", &cod);
			
// 			printf("QUANTIDADE DE HORAS NORMAIS:");
// 			fflush(stdin);
// 			scanf("%f", &horasn);
			
// 			printf("QUANTIDADE DE HORAS EXTRAS:");
// 			fflush(stdin);
// 			scanf("%f", &horase);
			
// 			printf("_________________________________________\n");
// 			printf("\n%d� FUNCIONARIO CALCULADO:\n",cont);
			
// 			respbruto = Sal_Bruto(horasn, horase);
// 			respliquido = Sal_Liquido(respbruto);
// 			mostra(cod,horasn,horase,respbruto,respliquido);
			
// 		}
		
// system("pause");
// return(0);
// }

// float Sal_Bruto(float p_horasn, float p_horase){
	
// 	float respn = 0, respe = 0, bruto = 0;
	
// 	respn = p_horasn * 12;
// 	respe = p_horase * 15.50;
// 	bruto = respn + respe;
	
// 	return(bruto);
	
// }
// float Sal_Liquido(float p_respbruto){
	
// 	float respliquido = 0;
	
// 	respliquido = p_respbruto * 0.1;
// 	respliquido = p_respbruto - respliquido;
	
// 	return(respliquido);
	
// }
// void mostra(int p_cod,float p_horasn, float p_horase,float p_respbruto,float p_respliquido){
	
// 		printf("O funcion�rio %d trabalhou %.f horas normais e %.f horas extras.\n",p_cod,p_horasn,p_horase);
// 		printf("Ir� receber R$ %.2f de sal�rio bruto e R$ %.2f de sal�rio liquido\n\n\n",p_respbruto,p_respliquido);
// }
