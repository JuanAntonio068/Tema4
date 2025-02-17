package parte5.ejercicio4;

import java.util.Scanner;

public class PrincipalPizza {

	public static void main(String[] args) {

		// Creamos el objeto
		Pizza p1;
		Pizza p2;

		// Variable para guardar el código
		int cod;

		// Variable para guardar el tamaño
		String tamaño;

		// Variable para guardar el sabor
		String sabor;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el código
		System.out.println("Inserta el código");
		cod = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		// Preguntamos por el tamaño
		System.out.println("Inserta el tamaño");
		tamaño = sc.nextLine();

		// Preguntamos por el sabor
		System.out.println("Inserta el sabor");
		sabor = sc.nextLine();

		// Llamamos al constructor
		p1 = new Pizza(cod, tamaño, sabor);

		// Preguntamos al usuario el código
		System.out.println("Inserta el código");
		cod = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		// Preguntamos por el tamaño
		System.out.println("Inserta el tamaño");
		tamaño = sc.nextLine();

		// Preguntamos por el sabor
		System.out.println("Inserta el sabor");
		sabor = sc.nextLine();

		// Llamamos al constructor
		p2 = new Pizza(cod, tamaño, sabor);

		// Imprimimos el primer objeto
		System.out.println(p1);

		// Salto de línea
		System.out.println();

		// Imprimimos el segundo objeto
		System.out.println(p2);

		// Salto de línea
		System.out.println();

		// Imprimimos el resultado de la comparación de los dos objetos
		System.out.println(p1.equals(p2));

		// Cerramos el escaner
		sc.close();
	}

}
