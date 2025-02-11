package parte5.ejercicio2;

import java.util.Scanner;

public class PrincipalLibro {

	public static void main(String[] args) {

		// Construimos los objetos
		Libro l1;
		Libro l2;

		// Variable para guardar el titulo
		String titulo;

		// Variable para guardar el autor
		String autor;

		// Variable para guardar los ejemplares
		int ejemplares;

		// Variable para guardar los ejemplares prestados
		int ejemplaresPrestados;

		// Variable para guardar el genero
		String genero;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos los datos
		System.out.println("Inserta el título");
		titulo = sc.nextLine();

		System.out.println("Inserta el autor");
		autor = sc.nextLine();

		System.out.println("Inserta los ejemplares");
		ejemplares = sc.nextInt();

		System.out.println("Inserta los ejemplares prestados");
		ejemplaresPrestados = sc.nextInt();

		sc.nextLine();

		System.out.println("Inserta el genero");
		genero = sc.nextLine();

		l1 = new Libro(titulo, autor, ejemplares, ejemplaresPrestados, genero);

		// Preguntamos los datos
		System.out.println("Inserta el título");
		titulo = sc.nextLine();

		System.out.println("Inserta el autor");
		autor = sc.nextLine();

		l2 = new Libro(titulo, autor);

		// Imprimimos los objetos
		System.out.println(l1);
		System.out.println(l2);

		// Llamamos a la función
		l1.prestamo(10);

		// Imprimimmos los ejemplares Prestados
		System.out.println(l1.getEjemplaresPrestados());

		// Llamamos a la función
		l1.devolucion(3);

		// Imprimimmos los ejemplares Prestados
		System.out.println(l1.getEjemplaresPrestados());

		// Hacemos un set para cambiar el género
		l2.setGenero("Poético");

		// Imprimimos el género
		System.out.println(l2.getGenero());

		// Imprimimos la comparación de los dos libros
		System.out.println(l1.equals(l2));

		// Cerramos el escaner
		sc.close();
	}

}
