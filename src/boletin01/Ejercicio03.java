package boletin01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.- Modificar el diagrama anterior para que permita sumar N números. El valor
				//de N se debe leer previamente por teclado.
				// pedir el radio de un circulo
		        int r,result;
		        
				Scanner leer = new Scanner(System.in);
				System.out.println("Ingrese el valor del radio: ");
				r =leer.nextInt();
				
				
				result=(int)(Math.PI)*2*r;

				System.out.println("el resultado es:"+result);
	}

}
