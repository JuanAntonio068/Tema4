package parte5.ejercicio1;

public class CuentaCorriente {

	// Atributo del dni del titular de la cuenta
	private int DNI;

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
	public CuentaCorriente(int DNI, double saldo) {
		this.DNI = DNI;

		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(int DNI, String nombre, double saldo) {
		this.DNI = DNI;

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(int DNI, String nombre, double saldo, String nacion) {
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

	public void setNacion(Nacionalidad nacion) {
		this.nacion = nacion;
	}

	public int getDNI() {
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
	
	
}
