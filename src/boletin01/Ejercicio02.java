package boletin01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// pedir el radio de un circulo
        int r,result,elevado;
        
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor del radio: ");
		r =leer.nextInt();
		
		elevado=(int)(Math.pow(r,2));
		result=(int)(Math.PI)*elevado;

		System.out.println("el resultado del area es:"+result);
	}

}
