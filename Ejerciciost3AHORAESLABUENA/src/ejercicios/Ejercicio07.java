package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT: -1 
		 OUTPUT: El número debe ser mayor que cero. 
		 RESULTADO ESPERADO: El número debe ser mayor que cero.
		 
		 INPUT: 0
		 OUTPUT: El número debe ser mayor que cero. 
		 RESULTADO ESPERADO: El número debe ser mayor que cero.
		
		 INPUT: 1  OUTPUT: 1 RESULTADO ESPERADO: 1
		 
		 INPUT: 4  
		 OUTPUT: 
1
121
12321
1234321
		 RESULTADO ESPERADO:
		 
1
121
12321
1234321
		 */

			int num; // Número introducido.
			int aux2;
			Scanner sc = new Scanner(System.in); //Llamamos al escáner
			
			System.out.print("Introduzca un número: "); //Pedimos el número
			
			num=sc.nextInt(); //Leemos el número
			
			if (num>0) { //Comprobamos que el número sea positivo
				
				for (int aux = 1; aux<=num ;aux++) { //Bucle que se encarga de hacer los saltos de línea
					
					System.out.println(); //Salto de línea
					
					for (aux2 = 1; aux2<aux ;aux2++) {//Bucle que se encarga de pintar los números hasta el número de la línea
						System.out.print(aux2); //Pintamos 
					}
				
					for (int aux3 = aux2; aux3>=1 ;aux3--) {//Bucle que se encarga de pintar los números desde el de la línea hasta 1
						System.out.print(aux3); //Pintamos 
					}
				}
				
			} else { //Si el número no es positivo...
				
				System.out.println("El número debe ser mayor que cero."); //Mensaje de error si el número es negativo
			}

			sc.close(); //Cerramos el escáner 
		}
		}


		

