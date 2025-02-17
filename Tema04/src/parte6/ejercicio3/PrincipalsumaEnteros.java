package parte6.ejercicio3;

public class PrincipalsumaEnteros {

	public static void main(String[] args) {

		// Declaramos el objeto
		SumaEnteros sumaEntero = new SumaEnteros();
		
		// Variable para guardar un número
		int n = 5;

		// Variable para guardar un número
		int n2 = 10;

		// Variable para guardar un número
		int n3 = 15;
		
		// Imprimimos la suma
		System.out.println(sumaEntero.sumaEntero(n));

		// Imprimimos la suma
		System.out.println(sumaEntero.sumaEntero(n2, n3));

	}

}
