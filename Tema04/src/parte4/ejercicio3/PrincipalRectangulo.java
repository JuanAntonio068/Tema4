package parte4.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		// Creamos los objetos
		Rectangulo rec1;
		Rectangulo rec2;

		// Variable para guardar el perímetro del primer rectangulo
		int perimetro1;

		// Variable para guardar el perímetro del segundo rectangulo
		int perimetro2;

		// Variable para guardar el area del primer rectangulo
		int area1;

		// Variable para guardar el area del segundo rectangulo
		int area2;

		// Variable para guardar la primera coordenada x
		int x1;

		// Variable para guardar la segunda coordenada x
		int x2;

		// Variable para guardar la primera coordenada y
		int y1;

		// Variable para guardar la segunda coordenada y
		int y2;

		// Damos valor a las coordenadas
		x1 = 0;
		y1 = 0;
		x2 = 5;
		y2 = 5;

		// Rellenamos los argumentos
		rec1 = new Rectangulo(x1, x2, y1, y2);

		x1 = 7;
		y1 = 9;
		x2 = 2;
		y2 = 3;

		// Rellenamos los argumentos
		rec2 = new Rectangulo(x1, x2, y1, y2);

		// Calculamos los dos perímetros
		perimetro1 = rec1.getPerimetro();
		perimetro2 = rec2.getPerimetro();

		area1 = rec1.getArea();
		area2 = rec2.getArea();

		System.out.println(rec1);
		System.out.println("Area: " + area1);
		System.out.println("Perímetro: " + perimetro1);
		System.out.println();

		System.out.println(rec2);
		System.out.println("Area: " + area2);
		System.out.println("Perímetro: " + perimetro2);

		// Salto de línea
		System.out.println();

		// Modificamos las coordenadas
		rec1.setX2Y2(20, 20);

		System.out.println(rec1);
		System.out.println();

		rec2.setX1Y1(50, 50);
		System.out.println(rec2);
		System.out.println();

		rec1.setAll(1, 2, 3, 4);
		System.out.println(rec1);

	}

}
