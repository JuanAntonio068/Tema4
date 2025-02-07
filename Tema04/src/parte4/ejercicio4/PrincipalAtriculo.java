package parte4.ejercicio4;

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

		// Imprimimos el resultado
		System.out.println(articulo);
		
		articulo.vender(3);
		
		articulo.almacenar(9);
		
		// Imprimimos el resultado
		System.out.println(articulo);
		
		System.out.println("Precio con el 50% de descuento: " + articulo.getPVPDescuento(50) + "€");
	}

}
