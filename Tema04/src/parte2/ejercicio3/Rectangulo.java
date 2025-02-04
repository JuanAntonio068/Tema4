package parte2.ejercicio3;

public class Rectangulo {

	// Variable para guardar la primera coordenada x
	int x1;

	// Variable para guardar la segunda coordenada x
	int x2;

	// Variable para guardar la primera coordenada y
	int y1;

	// Variable para guardar la segunda coordenada y
	int y2;

	// Creamos el constructor para la clase Rectangulo
	public Rectangulo(int x1, int x2, int y1, int y2) {

		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}
