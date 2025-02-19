package parte6.ejercicio5;

public class PrincipalNumerosAleatorios {

	public static void main(String[] args) {

		// Creamos el objeto
		NumerosAleatorios numRandom = new NumerosAleatorios();

		// Llamamos a la función
		numRandom.numerosAleatorios(9);

		// Salto de línea
		System.out.println();
		
		// Llamamos a la función
		numRandom.numerosAleatorios(9, 10);
		
		// Salto de línea
		System.out.println();
		
		//Llammamos a la función
		numRandom.numerosAleatorios(9, 10, 20);
	}

}
