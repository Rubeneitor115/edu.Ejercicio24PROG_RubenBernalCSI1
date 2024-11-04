/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 041124
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 041124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero, resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario el número
		System.out.println("Escriba un número entero: ");
		numero = sc.nextInt();
		
		//Realizo la función principal de la aplicación
		for(int i=0; i <= numero; i++) {
			resultado = funcion(numero);
		}
		
		//Muestro el resultado por pantalla
		System.out.println(resultado - 1);
		
		

	}
	
	public static int funcion(int numero) {

		int resultado;
	    if (numero == 0) {
	        return 1;
	    } else {
	        return numero + funcion(numero - 1);
	    }

	}

}
