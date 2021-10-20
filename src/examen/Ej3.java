package examen;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Pedir números por teclado hasta que se teclee un 0, mostrar la suma de todos
		//los números introducidos hasta ese momento
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor");
		int numero = sc.nextInt();
		int suma = 0;
		do {
			suma += numero;
			System.out.println("Introduce el siguiente valor");
			numero = sc.nextInt();			
		} while (numero!=0);
		System.out.println("La suma de todos los números es " + suma);
	}

}
