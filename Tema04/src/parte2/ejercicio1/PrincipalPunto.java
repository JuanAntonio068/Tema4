package parte2.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Declaramos los puntos
		Punto p1;
		Punto p2;
		Punto p3;

		//Varaible donde se va a guardar la coordenada x
		int x;
		
		//Varaible donde se va a guardar la coordenada y
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
		
		p3 = new Punto(x,y);
		
		// Imprimimos las coordenadas
		System.out.println(p1.x + ", " + p1.y);
		System.out.println(p2.x + ", " + p2.y);
		System.out.println(p3.x + ", " + p3.y);

		// Sumamamos las coordenadas
		p1.x += 1;
		p1.y += 1;
		p2.x += 1;
		p2.y += 1;
		p3.x += 1;
		p3.y += 1;

		System.out.println();
		
		// Imprimimos las coordenadas
		System.out.println(p1.x + ", " + p1.y);
		System.out.println(p2.x + ", " + p2.y);
		System.out.println(p3.x + ", " + p3.y);

	}

}
