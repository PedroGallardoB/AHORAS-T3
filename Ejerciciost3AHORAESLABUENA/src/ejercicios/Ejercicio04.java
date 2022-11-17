package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 */

		int num1; // Número introducido primero.
		int num2; // Número introducido segundo.
		int mcd = 0;
		int mayor; //Guarda el mayor de los num introducidos
		int menor; //Guarda el menor de los num introducidos
		int contador; //Es una variable auxiliar para cerrar el bucle 

		Scanner sc = new Scanner(System.in); //Llamamos al escáner

		System.out.print("Calcular máximo común divisor, introduzca el primer número: ");//Pedimos un número
		num1 = sc.nextInt();//Lo leemos
		System.out.print("Introduzca el segundo número: ");//Pedimos un número
		num2 = sc.nextInt();//Lo leemos

		if (num1 == num2) {//Si los números son iguales el máximo común divisor será ese mismo número

			mcd = num1;

		} else { //Si no son iguales...
			
			//Guardamos en las variables mayor y menor cual es cada uno
			mayor = num1 > num2 ? num1 : num2;
			menor = num1 < num2 ? num1 : num2;
			contador = menor+1; //Contador inicializa como menor + 1

			while (mcd != contador) { //Cuando el máximo común divisor sea igual al contador tendremos la solución

				contador--;//Restamos uno a contador por turno
				
				if (menor % contador == 0 && 0 == mayor % contador)//Si contador divide como a enteros al mayor y al menor...
					mcd = contador;//...Contador = Máximo Común Divisor

			}

		}
		System.out.println("El máximo común divisor es " + mcd); //Mostramos el resultado
		sc.close(); //Cerramos el escáner

	}
}
