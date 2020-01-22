package boletin01;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor1: ");
		a =leer.nextInt();
		
		System.out.println("Ingrese el valor2: ");
		b =leer.nextInt();
		
		
		if (a>b) {
			System.out.println("a es mayor que b");
		}else if (a<b) {
			System.out.println("a es menor que b");
		}else {
			System.out.println("son iguales ");
		}
	
	}

	

}
