package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Declaramos los puntos
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		// Añadimos valores
		p1.x = 5;
		p1.y = 0;
		p2.x = 10;
		p2.y = 10;
		p3.x = -3;
		p3.y = 7;

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
