package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT: 1 y 1 OUTPUT: 1 RESULTADO ESPERADO: 1
		 INPUT: 12 y 2 OUTPUT: 12 RESULTADO ESPERADO: 12
		 INPUT: 6 y -2 OUTPUT: RESULTADO ESPERADO: 6
		 INPUT: 0 y 0 OUTPUT: 0 RESULTADO ESPERADO: 0
		 INPUT: 57 y 21 OUTPUT: 399 RESULTADO ESPERADO: 399
		 */

		int num1; // Número introducido primero.
		int num2; // Número introducido segundo.
		int mcm = 0;//Resultado del programa
		int mayor; // Número mayor
		int menor; // Número menor
		int contador; //Es una variable auxiliar para cerrar el bucle 

		Scanner sc = new Scanner(System.in); //Llamamos al escáner

		System.out.print("Calcular mínimo común múltiplo, introduzca el primer número: "); //Pedimos el primer número
		num1 = sc.nextInt(); //Lo leemos
		
		System.out.print("Introduzca el segundo número: "); //Pedimos el segundo
		num2= sc.nextInt(); //Lo leemos

		if (num1 == num2) { //Si los números son iguales...

			mcm = num1; //... el mcm es el propio número

		} else { //De lo contrario...
			
			//Separamos los números en cual es mayor y cual menor con ternarios
			
			mayor = num1 > num2 ? num1 : num2;
			menor = num1 < num2 ? num1 : num2;
		
			contador = mayor-1;	//Iniciamos el contador una unidad por debajo del mayor
			

			while (mcm != contador) { //Mientras el contador sea distinto del mcm...

				contador++; //Agregamos uno al contador
				
				if (contador % mayor == 0 && 0 == contador % menor)//Si el resto de dividir el contador entre los números es cero...
					mcm = contador;  //...El mcm es igual al contador

			}

		}
		
		System.out.println("El mínimo común multiplo es " + mcm); //Imprimimos el resultado
		sc.close(); //Cerramos el escáner

	}
}
