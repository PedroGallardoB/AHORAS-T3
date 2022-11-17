package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT: num = 8  
		 OUTPUT: Hay 4 números primos.
		 RESULTADO ESPERADO: Hay 4 números primos.
		 
		 INPUT: num = 1
		 OUTPUT: Hay 0 números primos.
		 RESULTADO ESPERADO: Hay 0 números primos.
		 
		 INPUT: -2
		 OUTPUT: El número debe ser entero positivo.
		 RESULTADO ESPERADO: El número debe ser entero positivo.
		 
		 */

		int num; // Número introducido.
		int contador = 0; //Variable que contará los números primos.
		boolean primo;//Boolean que almacena si un número es o no es primo.
		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos al usuario el número

		System.out.println("Introduzca un número para cuantos primos hay hasta él."); // Pedimos
		num = sc.nextInt(); // Leemos

		// Comprobamos que el número introducido es positivo
		if (num >= 0) {
			// Recorremos los números desde 2 hasta el número

			for (int aux = 2; aux <= num; aux++) {//Iniciamos la aux en dos, la incrementamos cada turno y si llegase a ser mayor que num no se ejecuta
				
				primo = true; //Este bucle inicia a los números como primos

				for (int aux2 = 2; aux > aux2; aux2++) {//Iniciamos la aux2 en dos, la incrementamos cada turno y si llegase a ser mayor que aux no se ejecuta
					// Si el número es divisible por i deja de ser primo
					if (aux % aux2 == 0) { //Si el resto de dividir los auxiliares es 0, no será primo
						primo = false; //Si el número no es primo, aquí el booleano pasa a false
						break; //Cerramos el bucle
					}
				}
				
				if (primo) { //Si es primo...
					
					contador++; //... Se sumará uno al contador
				}
			}
				System.out.println("Hay " + contador + " números primos."); //Mostramos el resultado
				sc.close();//Cerramos el escáner

			
		} else {
			
			System.out.println("El número debe ser entero positivo.");
		}

	}
}