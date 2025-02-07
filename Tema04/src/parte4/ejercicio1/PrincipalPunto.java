package parte4.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Declaramos los puntos
		Punto p1;
		Punto p2;
		Punto p3;

		// Varaible donde se va a guardar la coordenada x
		int x;

		// Varaible donde se va a guardar la coordenada y
		int y;

		// Añadimos valores
		x = 5;
		y = 0;

		p1 = new Punto(x, y);

		x = 10;
		y = 10;

		p2 = new Punto(x, y);

		x = -3;
		y = 7;

		p3 = new Punto(x, y);

		// Imprimimos las coordenadas
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		// Sumamamos las coordenadas
		p1.desplaza(1, 1);
		p2.desplaza(1, 1);
		p3.desplaza(1, 1);

		System.out.println();

		// Imprimimos las coordenadas
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println();

		// Cambiamos la posición
		p1.setXY(6, 6);
		p2.setXY(3, 1);
		p3.setXY(5, 9);

		// Volvemos a imprimir
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println();
		
		// Calcula la distancia
		System.out.println(p1.distancia(p2));
	}

}
