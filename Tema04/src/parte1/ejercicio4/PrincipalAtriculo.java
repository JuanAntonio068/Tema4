package parte1.ejercicio4;

public class PrincipalAtriculo {

	public static void main(String[] args) {

		// Declaramos el objeto
		Articulo articulo = new Articulo();

		// Añadimos valores a las variables del articulo
		articulo.nombre = "Pijama";

		articulo.precioSinIVA = 10;

		// VAriable donde se va a calcular el PVP
		double PVP;

		PVP = articulo.precioSinIVA + ((articulo.precioSinIVA * articulo.IVA) / 100);

		// Imprimimos el resultado
		System.out.println(articulo.nombre + " - Precio: " + articulo.precioSinIVA + "€" + " - IVA: " + articulo.IVA
				+ "%" + " - PVP: " + PVP + "€");

		//Salto de línea
		System.out.println();
		
		// Cambiamos el precio
		articulo.precioSinIVA = 13;

		// Volvemos a calcular el PVP
		PVP = articulo.precioSinIVA + ((articulo.precioSinIVA * articulo.IVA) / 100);
		
		// Imprimimos el resultado
		System.out.println(articulo.nombre + " - Precio: " + articulo.precioSinIVA + "€" + " - IVA: " + articulo.IVA
				+ "%" + " - PVP: " + PVP + "€");

	}

}
