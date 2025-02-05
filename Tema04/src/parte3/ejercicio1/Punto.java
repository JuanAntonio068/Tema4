package parte3.ejercicio1;

/**
 * Clase donde están los puntos
 */
public class Punto {

	// Variabla para marcar la coordenadna x
	private int x;

	// Variabla para marcar la coordenadna y
	private int y;

	// Constructor para la clase punto
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;
	}

	/**
	 * Devuelve la coordenada x
	 * 
	 * @return La coordenada x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modidfica el valor de la coordenada x
	 * 
	 * @param x La coordenada x introducida por el usuario
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve la coordenada y
	 * 
	 * @return La coordenada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifica el valor de la coordenada y
	 * 
	 * @param y La coordenada y introducida por el usuario
	 */
	public void setY(int y) {
		this.y = y;
	}

}
