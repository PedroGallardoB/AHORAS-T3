package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*
		 PRUEBAS DEL EJERCICIO:
		 
		 INPUT: 123
		 OUTPUT: No es número capicúo
		 RESULTADO ESPERADO: No es número capicúo
		 
		 INPUT:123321  
		 OUTPUT: Es número capicúo
		 RESULTADO ESPERADO: Es número capicúo
		 
		 INPUT:0  OUTPUT: Es número capicúo
		 RESULTADO ESPERADO: Es número capicúo
		 
		 INPUT: -121 
		 OUTPUT: El número debe ser positivo 
		 RESULTADO ESPERADO: El número debe ser positivo
		 */
		
		int numero; //Guarda el número introducido
		int num; //Variable que variará para extraer las cifras
		int aux=0; //Variable que guatdará el número dado la vuelta
		Scanner sc = new Scanner(System.in);//Llamamos al escáner
		
		System.out.println("Introduzca un número para saber si es capicúa."); //Pedimos el número
		numero=sc.nextInt();//Lo leemos
		num=numero;//Damos a num el valor de número
		
		if (num<0) {
			
			System.out.println("El número debe ser positivo");
		}else {
	
		while(num!=0) {//Bucle mientras num no sea 0 para que aux sea inverso a numero
			
			int cifra = num % 10; //Cifra es el resto de dividir entre 10
			aux = aux*10 + cifra;//Aux se multiplica por 10 para cambiar de decena y se suma cifra
			num=num/10; //num se divide entre 10
			
		}
		
		if(numero==aux) {
			System.out.println("Es número capicúo"); //Si numero y aux son iguales es capicúo
			
		} else {
			
			System.out.println("No es número capicúo"); //Si numero y aux no son iguales no es capicúo
		}
		
		}
		sc.close();//Cerramos el escáner
	}
}

