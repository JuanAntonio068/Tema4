package parte6.ejercicio2;

public class PrincipalMedia {

	public static void main(String[] args) {

		// Declaramos el objeto
		Media media = new Media();

		// Variable para guardar un número
		int n = 34;

		// Variable para guardar un número
		int n2 = 35;

		// Variable para guardar un número
		int n3 = 40;

		// Variable para guardar un número
		int n4 = 50;

		// Variable para guardar un número
		int n5 = 60;
		
		// Imprimimos la suma
		System.out.println(media.media(n, n2));

		// Imprimimos la suma
		System.out.println(media.media(n3, n4, n5));

	}

}
