package examen;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//Solicita dos n�meros por teclado y devuelve informaci�n sobre si son
		//m�ltiplos o no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		int valor1 = sc.nextInt();
		System.out.println("Introduce el segundo valor");
		int valor2 = sc.nextInt();
		int mayor = valor1>valor2?valor1:valor2;
		int menor = valor1<valor2?valor1:valor2;
		String esModulo = mayor % menor == 0 ? " si" : " no";
		System.out.println(mayor + esModulo + " es m�ltiplo de " + menor);
		int menor = valor1<valor2?valor1:valor2;
		String esModulo = mayor % menor == 0 ? " si" : " no";
		System.out.println(mayor + esModulo + " es m�ltiplo de " + menor);
		int menor = valor1<valor2?valor1:valor2;
		String esModulo = mayor % menor == 0 ? " si" : " no";
		System.out.println(mayor + esModulo + " es m�ltiplo de " + menor);
		int menor = valor1<valor2?valor1:valor2;
		String esModulo = mayor % menor == 0 ? " si" : " no";
		System.out.println(mayor + esModulo + " es m�ltiplo de " + menor);
	}
}
