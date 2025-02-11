package parte5.ejercicio1;

public class CuentaCorriente {

	// Atributo del dni del titular de la cuenta
	private final String DNI;

	// Atributo del nombre
	private String nombre;

	// Atributo del saldo
	private double saldo;

	// Atrinuto de la nacionalidad
	private Nacionalidad nacion;

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	// Creamos los constructores para la clase CuentaCorriente
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;

		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String DNI, String nombre, double saldo, String nacion) {
		this.DNI = DNI;

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo >= 0) {
			this.saldo = saldo;
		}

		switch (nacion) {
		case "Española" -> this.nacion = Nacionalidad.ESPAÑOLA;

		default -> this.nacion = Nacionalidad.EXTRANJERA;

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Nacionalidad getNacion() {
		return nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = Nacionalidad.valueOf(nacion);
	}

	public String getDNI() {
		return DNI;
	}

	/**
	 * Función para sacar dinero de la cuenta
	 * 
	 * @param cantidad La cantidad de dinero que se desea sacar
	 * @return Devuelve true si se ha podido realizar la operación y false si no
	 */
	public boolean SacarDinero(int cantidad) {
		boolean verificar;

		if (this.saldo - cantidad >= 0) {

			this.saldo -= cantidad;
			verificar = true;
		} else {
			verificar = false;
		}

		return verificar;

	}

	/**
	 * Función para ingresar dinero
	 * 
	 * @param cantidad El dinero a ingresar
	 * @return Devuelve true si se ha podido realizar la operación y false si no
	 */
	public boolean ingresarDinero(int cantidad) {
		boolean verificar;

		if (cantidad > 0) {
			this.saldo += cantidad;
			verificar = true;
		} else {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Función para imprimir los datos
	 */
	public String toString() {
		String res;

		res = "DNI: " + this.DNI + "\n";
		res += "Nombre:" + this.nombre + "\n";
		res += "Saldo:" + this.saldo + "\n";
		res += "Nacionalidad:" + this.nacion + "\n";

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		CuentaCorriente cc2 = (CuentaCorriente) obj;

		boolean res = false;

		if (this.DNI.equals(cc2.DNI) && this.nombre.equals(cc2.nombre)) {
			res = true;
		}
		return res;
	}

}
