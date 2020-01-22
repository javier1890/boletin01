package boletin01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor: ");
		a =leer.nextInt();
		
		
		if (a>0) {
			System.out.println("es positivo");
		}else {
			System.out.println("es negativo");
		}
	}

}
