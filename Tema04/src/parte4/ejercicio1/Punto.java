package parte4.ejercicio1;

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

	/**
	 * Función para modificar ambas coordenadas
	 * 
	 * @param x La coordenada X
	 * @param y La coordenada Y
	 */
	public void setXY(int x, int y) {

		this.x = x;
		this.y = y;
	}

	/**
	 * Función para desplazar el punto
	 * 
	 * @param dx cuanto se desplaza la coordenada x
	 * @param dy cuanto se desplaza la coordenada y
	 */
	public void desplaza(int dx, int dy) {

		this.x += dx;
		this.y += dy;
	}

	/**
	 * Función para calcular la distincia entre dos puntos
	 * 
	 * @param p El otro punto
	 * @return La distancia que hay entre los dos puntos
	 */
	public double distancia(Punto p) {
		double distancia;

		distancia = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));

		return distancia;

	}

	/**
	 * Función para guardar las coordenadas en un String
	 * 
	 * @return El string con las coordenadas
	 */
	public String toString() {

		String punto;

		punto = "(" + this.x + ", " + this.y + ")";

		return punto;
	}
}
