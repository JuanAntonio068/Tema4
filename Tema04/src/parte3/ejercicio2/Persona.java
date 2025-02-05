package parte3.ejercicio2;

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

}
