package parte4.ejercicio3;

/**
 * Clase que representa un rectangulo
 */
public class Rectangulo {

	// Variable para guardar la primera coordenada x
	private int x1;

	// Variable para guardar la segunda coordenada x
	private int x2;

	// Variable para guardar la primera coordenada y
	private int y1;

	// Variable para guardar la segunda coordenada y
	private int y2;

	// Creamos el constructor para la clase Rectangulo
	public Rectangulo(int x1, int x2, int y1, int y2) {

		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}

	/**
	 * Devuelve la primera x
	 * 
	 * @return La primera coordenada x
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modifica la primera X
	 * 
	 * @param x1. Tiene que ser menor que la segunda x
	 */
	public void setX1(int x1) {

		if (x1 < x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Devuelve la segunda x
	 * 
	 * @return la segunda coordenda x
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica la segunda x
	 * 
	 * @param x2. Tiene que ser mayor que la primera x
	 */
	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}
	}

	/**
	 * Devuelve la primera y
	 * 
	 * @return La primera coordendada y
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Modifica la primera y
	 * 
	 * @param y1. No puede ser mayor que la segunda y
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Devuelve la segunda y
	 * 
	 * @return La segunda coordenada Y
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modifica la segunda y
	 * 
	 * @param y2. Tiene que ser mayor que la primera y
	 */
	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}

	/**
	 * Modifica las coordenas del primer punto
	 * 
	 * @param x1 La coordenada x del primer punto
	 * @param y1 La coordenada y del primer punto
	 */
	public void setX1Y1(int x1, int y1) {

		this.x1 = x1;

		this.y1 = y1;
	}

	/**
	 * Modifica las coordenas del segundo punto
	 * 
	 * @param x2 La coordenada x del segundp punto
	 * @param y2 La coordenada y del segundo punto
	 */
	public void setX2Y2(int x2, int y2) {

		this.x1 = x2;

		this.y1 = y2;
	}

	/**
	 * Modifica las coordenas de los dos puntos
	 * 
	 * @param x1 La coordenada x del primer punto
	 * @param y1 La coordenada y del primer punto
	 * @param x2 La coordenada x del segundp punto
	 * @param y2 La coordenada y del segundo punto
	 */
	public void setAll(int x1, int y1, int x2, int y2) {

		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * Función para calcular el perímetro
	 * 
	 * @return el peímetro del rectangulo
	 */
	public int getPerimetro() {
		int perimetro;

		perimetro = this.x1 + this.y1 + this.x2 + this.y2;

		return perimetro;
	}

	/**
	 * Función para calcular el area
	 * 
	 * @return el area del rectangulo
	 */
	public int getArea() {
		int area;

		area = (this.x1 + this.x2) * (this.y1 + this.y2);

		return area;

	}

	public String toString() {
		String res;

		res = "X1: " + this.x1 + "\n";
		res += "Y1: " + this.y1 + "\n";
		res += "X2: " + this.x2 + "\n";
		res += "Y2: " + this.y2 + "\n";
		
		return res;
	}
}
