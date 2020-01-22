package boletin01;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// pedir dos numeros y mostrarlos y ordenarlos de menos a mayor
		
		int a,b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor1: ");
		a =leer.nextInt();
		
		System.out.println("Ingrese el valor2: ");
		b =leer.nextInt();
		
		if (a>b) {
			System.out.println("es mayor:"+a);
			System.out.println("es menor:"+b);
		}else if (a<b) {
			System.out.println("es menor:"+a);
			System.out.println("es mayor:"+b);
		}else {
			System.out.println("son iguales ");
		}
	}

}
