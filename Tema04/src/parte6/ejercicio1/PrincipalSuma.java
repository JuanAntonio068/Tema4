package parte6.ejercicio1;

public class PrincipalSuma {

	public static void main(String[] args) {

		// Declaramos el objeto
		Suma suma = new Suma();

		// Variable para guardar un número
		int n = 34;

		// Variable para guardar un número
		int n2 = 35;

		// Variable para guardar un número
		double n3 = 49.7;

		// Variable para guardar un número
		double n4 = 50.6;

		// Imprimimos la suma
		System.out.println(suma.suma(n, n2));

		// Imprimimos la suma
		System.out.println(suma.suma(n3, n4));

	}

}
