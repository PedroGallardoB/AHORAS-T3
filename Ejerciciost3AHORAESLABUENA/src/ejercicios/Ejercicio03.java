package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT: 4
		 
		 OUTPUT: 
       * 
      * * 
     * * * 
    * * * * 
    * 
		 RESULTADO ESPERADO: 
		 
       * 
      * * 
     * * * 
    * * * * 

		 INPUT: 1
		 
		 OUTPUT:   * 
 
		 RESULTADO ESPERADO: * 

		 INPUT:  0
		 OUTPUT: El número debe ser mayor que cero.
		 RESULTADO ESPERADO: El número debe ser mayor que cero.
		 
		 INPUT:  -1
		 OUTPUT: El número debe ser mayor que cero.
		 RESULTADO ESPERADO: El número debe ser mayor que cero.
		 */

		Scanner sc = new Scanner(System.in);// Llamamos al escáner
		int altura; // Variable que guarda la altura
		System.out.print("Introduzca la altura del triángulo: ");// Pedimos la altura del triángulo
		altura = sc.nextInt();// Leemos la altura
		System.out.println();// Ponemos una línea en blanco

		// Bucle for con variable salto (controla el salto de línea) que inicia en uno y
		// aumenta cada turno, el bucle acaba si salto es mayor que altura

		if (altura > 0) {

			for (int salto = 1; salto <= altura; salto++) {

				int espacio = altura - salto; // Variable que usaremos para poner un límite a lo que podrá aumentar la
												// variable pintar

				for (int pintar = 1; pintar <= espacio; pintar++) {// Bucle con variable pintar que se encarga de poner
																	// los espacios de la pirámide mientras pintar no
																	// sea mayor a espacio.

					System.out.print(" "); // Pintamos espacio

				}

				for (int aux = 1; aux <= salto; aux++) { // Bucle con variable aux que aumenta cada turno hasta que sea
															// mayor que salto, para pintar los asteriscos
					System.out.print("* ");// Pinta los asteriscos de la pirámide

				}

				System.out.println();// Se encarga de los saltos de línea de la pirámide

			}
			
		} else {
			
			System.out.println("El número debe ser mayor que cero.");
		}

		sc.close();// Cerramos el escáner

	}
}
