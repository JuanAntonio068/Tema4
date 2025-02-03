package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Declaramos los objetos
		Persona per1 = new Persona();
		Persona per2 = new Persona();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos los datos de la primera persona
		System.out.println("Inserte su dni");
		per1.dni = sc.nextLine();

		System.out.println("Inserte su nombre");
		per1.nombre = sc.nextLine();

		System.out.println("Inserte sus apellidos");
		per1.apellidos = sc.nextLine();

		System.out.println("Inserte su edad");
		per1.edad = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		// Preguntamos los datos de la segunda persona
		System.out.println("Inserte su dni");
		per2.dni = sc.nextLine();

		System.out.println("Inserte su nombre");
		per2.nombre = sc.nextLine();

		System.out.println("Inserte sus apellidos");
		per2.apellidos = sc.nextLine();

		System.out.println("Inserte su edad");
		per2.edad = sc.nextInt();

		// Imprimimos el resultados
		System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " "
				+ ((per1.edad < 18) ? "no es mayor de edad" : "es mayor de edad"));

		System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " "
				+ ((per2.edad < 18) ? "no es mayor de edad" : "es mayor de edad"));
	}

}
