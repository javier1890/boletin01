package boletin01;

import java.util.Scanner;

public class Ejercicio06 {
/**
 * ver si un numero si es multiplo de otro o no
 * @param args
 */
	public static void main(String[] args) {

		int a,b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor1: ");
		a =leer.nextInt();
		
		System.out.println("Ingrese el valor1: ");
	    b =leer.nextInt();
	    
	   
	    if(a%b==0) {
	    	System.out.println("a es multiplo de b");
	    }else {
	    	System.out.println("no son multiplos");
		}
		
  }
}