package boletin01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// pedir dos numeros y saber si sin iguales o no

        int num1,num2;
        
				Scanner leer = new Scanner(System.in);
				System.out.println("Ingrese el valor1: ");
				num1 =leer.nextInt();
				
				System.out.println("Ingrese el valor2: ");
				num2 =leer.nextInt();
				
				if (num1==num2) {
					System.out.println("el numero num1 y num2 son iguales ");
				}else {
					System.out.println("el numero num1 y num2 no son iguales ");
				}
				
	}

}
