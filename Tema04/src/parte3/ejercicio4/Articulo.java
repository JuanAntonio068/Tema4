package parte3.ejercicio4;

public class Articulo {

	// Variable dodne se va a guardar el nombre
	private String nombre = "";

	// Variable dodne se va a guardar el precio sin iva
	private double precioSinIVA;

	// Constante dodne se va a guardar el IVA
	private int IVA = 21;

	// Variable dodne se va a guardar cuantos quedan
	private int cuantosQuedan;

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
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * 
	 * @param nombre. No puede ser null ni estar en blanco
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve el precio
	 * 
	 * @return El precio sin IVA
	 */
	public double getPrecioSinIVA() {
		return precioSinIVA;
	}

	/**
	 * Modifica el precio
	 * 
	 * @param precioSinIVA. No puede ser ni 0 ni negativo
	 */
	public void setPrecioSinIVA(double precioSinIVA) {
		if (precioSinIVA > 0) {
			this.precioSinIVA = precioSinIVA;
		}
	}

	/**
	 * Devuelve el IVA
	 * 
	 * @return El IVA que se aplica a un producto
	 */
	public int getIVA() {
		return IVA;
	}

	/**
	 * Modifica el IVA
	 * 
	 * @param iVA. No puede ser ni 0 ni negativo
	 */
	public void setIVA(int iVA) {
		if (precioSinIVA > 0) {
			IVA = iVA;
		}
	}

	/**
	 * Devuelve cuantos quedan
	 * 
	 * @return El número de artículos que quedan
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica cuantos quedan
	 * 
	 * @param cuantosQuedan. No puede ser negativo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

}
