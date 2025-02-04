package parte2.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Declaramos los objetos
		Persona per1;
		Persona per2;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a guardar el dni
		String dni;

		// Variable donde se va a guardar el nombre
		String nombre;

		// Variable donde se va a guardar los apellidos
		String apellidos;

		// Variable donde se va a guardar la edad
		int edad;

		// Preguntamos los datos de la primera persona
		System.out.println("Inserte su dni");
		dni = sc.nextLine();

		System.out.println("Inserte su nombre");
		nombre = sc.nextLine();

		System.out.println("Inserte sus apellidos");
		apellidos = sc.nextLine();

		System.out.println("Inserte su edad");
		edad = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		// Creamos los argumentos
		per1 = new Persona(dni, nombre, apellidos, edad);

		// Preguntamos los datos de la segunda persona
		System.out.println("Inserte su dni");
		dni = sc.nextLine();

		System.out.println("Inserte su nombre");
		nombre = sc.nextLine();

		System.out.println("Inserte sus apellidos");
		apellidos = sc.nextLine();

		System.out.println("Inserte su edad");
		edad = sc.nextInt();

		// Creamos los argumentos
		per2 = new Persona(dni, nombre, apellidos, edad);

		// Imprimimos el resultados
		System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " "
				+ ((per1.edad < 18) ? "no es mayor de edad" : "es mayor de edad"));

		System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " "
				+ ((per2.edad < 18) ? "no es mayor de edad" : "es mayor de edad"));

		// Cerramos el esscaner
		sc.close();
	}

}
