package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS DEL EJERCICIO:
		 * 
		 * INPUT: 1, 2, 3, 0
		 * OUTPUT: Fallos : 0, Total de números: 3
		 * RESULTADO ESPERADO: Fallos : 0, Total de números: 3
		 * 
		 * INPUT: 0
		 * OUTPUT: Cero finaliza el programa, no hay números introducidos.
		 * RESULTADO ESPERADO: Cero finaliza el programa, no hay números introducidos. 
		 * 
		 * INPUT: 3, 1 (Output: Fallo, es menor), 0
		 * OUTPUT: Fallos : 1, Total de números: 2
		 * RESULTADO ESPERADO: Fallos : 1, Total de números: 2
		 */

		int fallo = 0; // Variable que almacena la cantidad de fallos
		int total = 0; // Variable que almacena el total de respuestas
		int num; // Variable que almacena el número introducido
		int old; // Variable que almacena el número del bucle anterior

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		System.out.print("Introduzca un número inicial: "); // Pedimos un número
		num = sc.nextInt(); // Lo leemos
		
		if (num==0) System.out.println("Cero finaliza el programa, no hay números introducidos.");
			
		total++; // Sumamos uno al total

		while (num != 0) { // Mientras el número sea distinto de 0...

			old = num; // Guardamos el valor de num en old

			System.out.print("Introduzca un número: "); // Pedimos otro número en la variable num
			num = sc.nextInt();// Lo leemos
			total++;// Sumamos uno al total

			if (num == 0) {// Si num vale cero

				total--;// Restamos uno al total (cero no cuenta)
				System.out.println("Fallos : " + fallo + ", Total de números: " + total); // Imprimimos el resultado

			}
			if (num < old && num!=0) { // Si el número es manor
				System.out.println("Fallo, es menor."); // Indicamos el fallo al usuario
				fallo++; // Sumamos uno al contador de fallos
			}

		}

		sc.close(); // Cerramos el escáner

	}
}