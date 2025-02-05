package parte3.ejercicio2;

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
		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " "
				+ ((per1.getEdad() < 18) ? "no es mayor de edad" : "es mayor de edad"));

		System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " "
				+ ((per2.getEdad() < 18) ? "no es mayor de edad" : "es mayor de edad"));

		// Modificamos los atributos de la primera persona
		System.out.println("Inserta un nuevo nombre para la primera persona");
		nombre = sc.nextLine();
		
		System.out.println("Inserta nuevos apellidos para la primera persona");
		apellidos = sc.nextLine();
		
		System.out.println("Inserta una nueva edad para la primera persona");
		edad = sc.nextInt();
		
		per1.setNombre(nombre);
		per1.setApellidos(apellidos);
		per1.setEdad(edad);
		
		//Lo imprimimos 
		System.out.println(per1.getNombre() + per1.getApellidos() + per1.getEdad());
		
		// Cerramos el esscaner
		sc.close();
	}

}
