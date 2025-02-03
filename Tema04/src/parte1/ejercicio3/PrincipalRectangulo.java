package parte1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		// Creamos los objetos
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		// Variable para guardar el perímetro del primer rectangulo
		int perimetro1;

		// Variable para guardar el perímetro del segundo rectangulo
		int perimetro2;

		// Variable para guardar el area del primer rectangulo
		int area1;

		// Variable para guardar el area del segundo rectangulo
		int area2;

		// Damos valor a las coordenadas
		rec1.x1 = 0;
		rec1.y1 = 0;
		rec1.x2 = 5;
		rec1.y2 = 5;

		rec2.x1 = 7;
		rec2.y1 = 9;
		rec2.x2 = 2;
		rec2.y2 = 3;

		// Calculamos los dos perímetros
		perimetro1 = rec1.x1 + rec1.x2 + rec1.y1 + rec1.y2;
		perimetro2 = rec2.x1 + rec2.x2 + rec2.y1 + rec2.y2;

		area1 = (rec1.x1 + rec1.x2) * (rec1.y1 + rec1.y2);
		area2 = (rec2.x1 + rec2.x2) * (rec2.y1 + rec2.y2);

		// Imrpimimos el resultado
		System.out.println("Las coordenadas del primer rectangulo son: " + rec1.x1 + ", " + rec1.x2 + ", " + rec1.y1
				+ ", " + rec1.y2 + "Y el perímetro y el área son: " + perimetro1 + " " + area1);
		System.out.println("Las coordenadas del segundo rectangulo son: " + rec2.x1 + ", " + rec2.x2 + ", " + rec2.y1
				+ ", " + rec2.y2 + "Y el perímetro y el área son: " + perimetro2 + " " + area2);

		// Salto de línea
		System.out.println();

		// Modificamos las coordenadas
		rec1.x2 = 20;

		rec2.y2 = 50;

		// Calculamos los dos perímetros
		perimetro1 = rec1.x1 + rec1.x2 + rec1.y1 + rec1.y2;
		perimetro2 = rec2.x1 + rec2.x2 + rec2.y1 + rec2.y2;

		area1 = (rec1.x1 + rec1.x2) * (rec1.y1 + rec1.y2);
		area2 = (rec2.x1 + rec2.x2) * (rec2.y1 + rec2.y2);

		// Imrpimimos el resultado
		System.out.println("Las coordenadas del primer rectangulo son: " + rec1.x1 + ", " + rec1.x2 + ", " + rec1.y1
				+ ", " + rec1.y2 + "Y el perímetro y el área son: " + perimetro1 + " " + area1);
		System.out.println("Las coordenadas del segundo rectangulo son: " + rec2.x1 + ", " + rec2.x2 + ", " + rec2.y1
				+ ", " + rec2.y2 + "Y el perímetro y el área son: " + perimetro2 + " " + area2);
	}

}
