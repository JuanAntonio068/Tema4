package parte5.ejercicio3;

public class Alumno {

	private String nombre;

	private double media;

	public Alumno(String nombre, double media) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * 
	 * @param nombre El nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la media
	 * 
	 * @return La nota media del alumno
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Modifica la media
	 * 
	 * @param media La nota media del alumno
	 */
	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		String res;

		res = this.nombre + " " + this.media;

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Alumno a2 = (Alumno) obj;

		if (this.nombre.equals(a2.nombre)) {
			res = true;
		}
		return res;
	}
}
