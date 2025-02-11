package parte5.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {

		// Llamamos al objeto
		CuentaCorriente cc1;
		CuentaCorriente cc2;

		// Variable donde se va a guardar el DNI
		String DNI;

		// Variale donde se va a guardar el nombre
		String nombre;

		// Variale donde se va a guardar el saldo
		double saldo;

		// Variable donde se va a guardar la nacionalidad
		String nacion;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por los datos de la cuenta
		System.out.println("Introduzca el DNI");
		DNI = sc.nextLine();

		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();

		System.out.println("Introduzca el saldo");
		saldo = sc.nextDouble();

		sc.nextLine();

		System.out.println("Introduzca su nacionalidad");
		nacion = sc.nextLine();

		cc1 = new CuentaCorriente(DNI, nombre, saldo, nacion);

		// Preguntamos al usuario por los datos de la cuenta
		System.out.println("Introduzca el DNI");
		DNI = sc.nextLine();

		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();

		System.out.println("Introduzca el saldo");
		saldo = sc.nextDouble();

		sc.nextLine();

		cc2 = new CuentaCorriente(DNI, nombre, saldo);

		System.out.println(cc1);
		System.out.println(cc2);

		cc1.ingresarDinero(50);

		cc1.SacarDinero(30);

		System.out.println(cc1.getSaldo());
		
		cc2.setNacion("ESPAÑOLA");
		
		System.out.println(cc2.getNacion());
		
		// Comparamos las dos cuentas
		System.out.println(cc1.equals(cc2));
		
		//Cerramos el escaner
		sc.close();
	}

}
