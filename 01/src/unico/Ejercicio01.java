package unico;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/*Diseñar un programa que muestre, para cada número introducido por teclado,
 * si es par, si es positivo, y su cuadrado. El proceso terminará cuando
 * el número introducido por teclado sea 0.
 */
		
		int num;
		String mensaje;
		
		System.out.println("Introduzca un número [0 - salir]: ");
		num = Integer.parseInt(teclado.nextLine()); 

		while (num != 0) {

			mensaje = (num % 2 == 0) ? "Es par" : "Es impar";	
			mensaje += (num < 0) ? " y negativo." : " y positivo.";
			mensaje += " Su cuadrado vale " + (num * num);
			
			System.out.println(mensaje);
			
			System.out.println("Introduzca un número [0 - salir]: ");
			num = Integer.parseInt(teclado.nextLine()); 
		}
	}
}
