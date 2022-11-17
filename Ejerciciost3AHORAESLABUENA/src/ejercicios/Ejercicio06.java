package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
public static void main(String[] args) {
	
	/*
	 PRUEBAS DEL EJERCICIO:
	 
	 INPUT: 21 
	 OUTPUT: Error, el número está fuera del rango 
	 RESULTADO ESPERADO: Error, el número está fuera del rango
	
	 INPUT: 0 
	 OUTPUT: Error, el número está fuera del rango
	 RESULTADO ESPERADO: Error, el número está fuera del rango
	 INPUT:  OUTPUT: RESULTADO ESPERADO: Error, el número está fuera del rango
	
	 INPUT: 1  
	 OUTPUT: 1
	 RESULTADO ESPERADO: 1
	 
	 INPUT: 20  
	 OUTPUT: 
1
22
333
4444
55555
666666
7777777
88888888
999999999
10101010101010101010
1111111111111111111111
121212121212121212121212
13131313131313131313131313
1414141414141414141414141414
151515151515151515151515151515
16161616161616161616161616161616
1717171717171717171717171717171717
181818181818181818181818181818181818
19191919191919191919191919191919191919
2020202020202020202020202020202020202020
	
	 RESULTADO ESPERADO: 
1
22
333
4444
55555
666666
7777777
88888888
999999999
10101010101010101010
1111111111111111111111
121212121212121212121212
13131313131313131313131313
1414141414141414141414141414
151515151515151515151515151515
16161616161616161616161616161616
1717171717171717171717171717171717
181818181818181818181818181818181818
19191919191919191919191919191919191919
2020202020202020202020202020202020202020
	 
	 */
	
	int num; // Número introducido.
	Scanner sc = new Scanner(System.in); //Llamamos al escáner
	
	System.out.println("Introduzca un número del 1 al 20."); //Pedimos el número
	System.out.println("Escribirás desde el 1 todos los anteriores hasta él tantas veces como indique su valor."); //Explicamos el programa
	num=sc.nextInt(); //Leemos el número
	
	if (num>0 && num<=20) { //Comprobamos que el número está en el rango
		
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
