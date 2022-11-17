package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
public static void main(String[] args) {
	
	/*
	 PRUEBAS DEL EJERCICIO:
	 
	 INPUT:  OUTPUT: RESULTADO ESPERADO:
	 INPUT:  OUTPUT: RESULTADO ESPERADO:
	 INPUT:  OUTPUT: RESULTADO ESPERADO:
	 INPUT:  OUTPUT: RESULTADO ESPERADO:
	 */
	
	int num; // Número introducido.
	Scanner sc = new Scanner(System.in); //Llamamos al escáner
	
	System.out.println("Introduzca un número del 1 al 20."); //Pedimos el número
	System.out.println("Escribirás desde el 1 todos los anteriores hasta él tantas veces como indique su valor."); //Explicamos el programa
	num=sc.nextInt(); //Leemos el número
	
	if (num>0 && num<20) { //Comprobamos que el número está en el rango
		
		for (int aux = 1; aux<=num ;aux++) {//Se encarga de saltar de fila
			
			System.out.println(); //Imprimimos un salto de línea
			
			for (int aux2 = 1; aux2<=aux ;aux2++) { //Se encarga de pintar el número de esa fila tantas veces como su valor
				System.out.print(aux); //Escribe el número de esa línea
			}
		}
		
	} else { //Si no está em el rango...
		
		System.out.println("Error, el número está fuera del rango"); //Mensaje de error si el número no está en el rango
	}

	sc.close(); //Cerramos el escáner
}
}
