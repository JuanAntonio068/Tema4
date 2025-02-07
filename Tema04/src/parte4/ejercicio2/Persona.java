package parte4.ejercicio2;

/**
 * Clase que representa una persona
 */
public class Persona {

	// Variable para guardar el dni
	private String dni;

	// Variable para guardar el nombre
	private String nombre;

	// Variable para guardar los apellidos
	private String apellidos;

	// Variable para guardar la edad
	private int edad;

	// Constructor para la clase persona
	public Persona(String dni, String nombre, String apellidos, int edad) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param El nombre de la persona. No puede ser ni null, ni estar en blanco
	 */
	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve los apellidos
	 * 
	 * @return Los apellidos de la persona.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Modifica los apellidos de la persona
	 * 
	 * @param apellidos. No puede ser ni null, ni estar en blanco
	 */
	public void setApellidos(String apellidos) {

		if (apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Devuelve la edad
	 * 
	 * @return La edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad de la persona
	 * 
	 * @param edad. No puede ser 0 ni negativo
	 */
	public void setEdad(int edad) {

		if (edad > 0) {
			this.edad = edad;
		}

	}

	/**
	 * Devuelve el dni
	 * 
	 * @return El dni de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Función para saber si es mayor edad
	 * 
	 * @return Booleano que dice si es mayor de edad
	 */
	public boolean esMayorEdad() {
		boolean mayorEdad;

		if (this.edad >= 18) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}

		return mayorEdad;
	}

	/**
	 * Función para saber si la persona es jubilada
	 * 
	 * @return Booleano que dice si es jubiladp
	 */
	public boolean esJubilado() {

		Boolean jubilado;

		if (this.edad >= 65) {
			jubilado = true;
		} else {
			jubilado = false;
		}

		return jubilado;
	}

	/**
	 * Función para saber la diferencia de edad entre dos personas
	 * 
	 * @param p La segunda persona
	 * @return La diferencia de edad
	 */
	public int diferenciaEdad(Persona p) {

		int diferencia;

		diferencia = Math.abs(this.edad - p.edad);

		return diferencia;
	}
	
	/**
	 * Funcón para imrpimrir el objeto
	 */
	public String toString() {
		
		String res;
		
		res = "DNI: " + this.dni + "\n";
		res+= "Nombre: " + this.nombre + "\n";
		res+= "Apellidos: " + this.apellidos + "\n";
		res+= "Edad: " + this.edad + "\n";
		
		return res;
	}
}
