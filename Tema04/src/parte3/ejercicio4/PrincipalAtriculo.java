package parte3.ejercicio4;

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

		PVP = articulo.getPrecioSinIVA() + ((articulo.getPrecioSinIVA() * articulo.getIVA()) / 100);

		// Imprimimos el resultado
		System.out.println(
				articulo.getNombre() + " - Precio: " + articulo.getPrecioSinIVA() + "€" + " - IVA: " + articulo.getIVA()
						+ "%" + " - PVP: " + PVP + "€ y quedan " + articulo.getCuantosQuedan() + " artículos");

		// Salto de línea
		System.out.println();

		// Cambiamos los atributos
		articulo.setNombre("Gorra");
		articulo.setPrecioSinIVA(13);
		articulo.setIVA(10);
		articulo.setCuantosQuedan(7);

		// Volvemos a calcular el PVP
		PVP = articulo.getPrecioSinIVA() + ((articulo.getPrecioSinIVA() * articulo.getIVA()) / 100);

		// Imprimimos el resultado
		System.out.println(
				articulo.getNombre() + " - Precio: " + articulo.getPrecioSinIVA() + "€" + " - IVA: " + articulo.getIVA()
						+ "%" + " - PVP: " + PVP + "€ y quedan " + articulo.getCuantosQuedan() + " artículos");

	}

}
