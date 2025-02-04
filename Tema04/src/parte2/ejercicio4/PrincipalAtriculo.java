package parte2.ejercicio4;

public class PrincipalAtriculo {

	public static void main(String[] args) {

		// Declaramos el objeto
		Articulo articulo;

		// Variable donde se va a guardar el nombre
		String nombre;

		// Variable donde se va a guardar el precio
		double precioSinIVA;

		// Variable donde se va a guardar el IVA
		int IVA;

		// Variable donde se va a guardar cuantos quedam
		int cuantosQuedan;

		// Añadimos valores a las variables del articulo
		nombre = "Pijama";

		precioSinIVA = 10;

		IVA = 21;

		cuantosQuedan = 6;

		// Añadimos los valores al argumento
		articulo = new Articulo(nombre, precioSinIVA, IVA, cuantosQuedan);

		// Variable donde se va a calcular el PVP
		double PVP;

		PVP = articulo.precioSinIVA + ((articulo.precioSinIVA * articulo.IVA) / 100);

		// Imprimimos el resultado
		System.out.println(articulo.nombre + " - Precio: " + articulo.precioSinIVA + "€" + " - IVA: " + articulo.IVA
				+ "%" + " - PVP: " + PVP + "€ y quedan " + articulo.cuantosQuedan + " artículos");

		// Salto de línea
		System.out.println();

		// Cambiamos el precio
		articulo.precioSinIVA = 13;

		// Volvemos a calcular el PVP
		PVP = articulo.precioSinIVA + ((articulo.precioSinIVA * articulo.IVA) / 100);

		// Imprimimos el resultado
		System.out.println(articulo.nombre + " - Precio: " + articulo.precioSinIVA + "€" + " - IVA: " + articulo.IVA
				+ "%" + " - PVP: " + PVP + "€ y quedan " + articulo.cuantosQuedan + " artículos");

	}

}
