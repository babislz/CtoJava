public class EX_14 {
    public static float multi() {
        return (5000.0f * 9) / 100;
    }
    
    public static void main(String[] args) {
        System.out.println("The result is: " + multi());
    }
}

//------------------------------| Código em C |------------------ ------------//
/*
#include<stdio.h>

float multi();

int main(){
	
	printf("o resultado eh %f \n", multi());
	
	
system("pause");
return 0;
	
}


float multi(){
	
	return 5000.0 * 9 / 100;
} */