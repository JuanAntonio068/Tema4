package parte6.ejercicio6;

public class PrincipalFuncionesMatematicas {

	public static void main(String[] args) {

		// Creamos el objeto
		FuncionesMatematicas fM = new FuncionesMatematicas();

		// Llamamos a la función
		System.out.println(fM.sumatorio(6));

		// Salto de línea
		System.out.println();

		// Llamamos a la función
		System.out.println(fM.potencia(2, 2));

		// Salto de línea
		System.out.println();

		// Llamamos a la función
		System.out.println(fM.serieFibonacci(8));
		
	}

}
