package parte2.ejercicio4;

public class Articulo {

	// Variable dodne se va a guardar el nombre
	String nombre = "";

	// Variable dodne se va a guardar el precio sin iva
	double precioSinIVA;

	// Constante dodne se va a guardar el IVA
	int IVA = 21;

	// Variable dodne se va a guardar cuantos quedan
	int cuantosQuedan;

	// Creamos el constructor
	public Articulo(String nombre, double precioSinIVA, int IVA, int cuantosQuedan) {

		// Nos aseguramos de que los valores sean correctos
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (precioSinIVA > 0) {
			this.precioSinIVA = precioSinIVA;
		}
		if (IVA > 0) {
			this.IVA = IVA;
		}
		if (cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}
}
