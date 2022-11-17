package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 INPUT:  OUTPUT: RESULTADO ESPERADO:
		 */
		
		int cifras=0; //Variable que guarda las cifras
		int num; //Guarda el número
		int decimas = 1; //Variable auxiliar para obtener las cifras

		Scanner sc = new Scanner(System.in); //Llamamos al escáner
		
		System.out.print("Introduzca un número mayor que cero: "); //Pedimos el número
		num = sc.nextInt();//Lo leemos
		
		if(num<0) { //Si el número es negativo...
			
			System.out.println("Lo siento, el número tiene que ser mayor que cero."); //...Mostramos error
		
		}else{//Si es positivo...
			
			for (int div = num/decimas; div>=1;div = num/decimas){ //...Iniciamos un bucle que cuenta las cifras dividiendo entre múltiplos de 10
				
				cifras++;//Contador de cifras
				decimas *=10;//Multiplos de 10 para separar las cifras
			
		}
			
		System.out.println("El número tiene " + cifras + " dígitos."); //Mostramos el resultado
		
		sc.close(); //Cerramos el escáner
}
}
}