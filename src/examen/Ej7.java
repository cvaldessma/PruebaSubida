package examen;

public class Ej7 {

	public static void main(String[] args) {
		//Dise�ar un programa que muestre el producto de los 10 primeros n�meros impares
		int NUM_IMPARES = 10;
		int producto = 1;
		for (int i = 1; i<=NUM_IMPARES; i++) {
			int impar = (i*2)-1;
			producto *= impar;
		}		
		System.out.println("El producto de los 10 primeros n�meros impares es " + producto);
	}

}
