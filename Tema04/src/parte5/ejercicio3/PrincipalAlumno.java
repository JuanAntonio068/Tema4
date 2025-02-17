package parte5.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {

	public static void main(String[] args) {

		// Creamos los objetoss
		Alumno a1;
		Alumno a2;

		// Variable para guardar el nombre del alumno
		String nombre;

		// Variable para guardar la nota del alumno
		double nota;

		// Declaremos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos por el nombre del alumno
		System.out.println("Inserta el nombre del alumno");
		nombre = sc.nextLine();

		// Preguntamos por la nota media del alumno
		System.out.println("Inserta la nota media del alumno");
		nota = sc.nextDouble();

		// Limpiamos el escaner
		sc.nextLine();

		// Llamamos al constructor
		a1 = new Alumno(nombre, nota);

		// Preguntamos por el nombre del alumno
		System.out.println("Inserta el nombre del alumno");
		nombre = sc.nextLine();

		// Preguntamos por la nota media del alumno
		System.out.println("Inserta la nota media del alumno");
		nota = sc.nextDouble();

		// Llamamos al constructor
		a2 = new Alumno(nombre, nota);

		// Imprimimos el primer alumno
		System.out.println(a1);

		// Salto de línea
		System.out.println();

		// Imprimimos el segundo alumno
		System.out.println(a2);

		// Salto de línea
		System.out.println();

		// Comparamos los dos alumnos
		System.out.println(a1.equals(a2));

		// Cerramos el escaner
		sc.close();
	}

}
