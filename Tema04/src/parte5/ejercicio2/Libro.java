package parte5.ejercicio2;

public class Libro {

	private String titulo;

	private String AUTOR;

	private int ejemplares;

	private int ejemplaresPrestados;

	private Genero genero;

	enum Genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}

	public Libro(String titulo, String autor) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.AUTOR = autor;
		}
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.AUTOR = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (ejemplaresPrestados >= 0 && ejemplaresPrestados < ejemplares) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.AUTOR = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (ejemplaresPrestados >= 0 && ejemplaresPrestados < ejemplares) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
		switch (genero) {
		case "Narrativo" -> this.genero = Genero.Narrativo;
		case "Lirico" -> this.genero = Genero.Lírico;
		case "Dramatico" -> this.genero = Genero.Dramático;
		case "Didactico" -> this.genero = Genero.Didáctico;
		default -> this.genero = Genero.Poético;
		}

	}

	/**
	 * Devuelve el título
	 * 
	 * @return El tiítulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el título del libro
	 * 
	 * @param titulo El título del libro
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el número de ejemplares
	 * 
	 * @return El número de ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Modifica los ejemplares
	 * 
	 * @param ejemplares El nuevo número de ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * Modifica los ejemplares prestados
	 * 
	 * @return Los ejemplares prestados
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * Modifica los ejemplares prestados
	 * 
	 * @param ejemplaresPrestados Los nuevos ejemplares prestados
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * Devuelve el genero
	 * 
	 * @return el género del libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Modifica el género
	 * 
	 * @param genero El nuevo género del libro
	 */
	public void setGenero(String genero) {
		this.genero = Genero.valueOf(genero);
	}

	/**
	 * Devuelve el autor
	 * 
	 * @return El nombre del autro del libro
	 */
	public String getAUTOR() {
		return AUTOR;
	}

	/**
	 * Método para prestar un libro
	 * 
	 * @param cantidad la cantidad de libros que se han prestado
	 * @return Devuelve true si se ha podido realizar la operación y false si no
	 */
	public boolean prestamo(int cantidad) {
		boolean res = false;

		if (this.ejemplares >= this.ejemplaresPrestados && this.ejemplares >= this.ejemplaresPrestados + cantidad) {
			this.ejemplaresPrestados += cantidad;
			res = true;
		}

		return res;
	}

	/**
	 * Método para devolver un libro
	 * 
	 * @param cantidad la cantidad de libros que se han devuelto
	 * @return Devuelve true si se ha podido realizar la operación y false si no
	 */
	public boolean devolucion(int cantidad) {
		boolean res = false;

		if (this.ejemplaresPrestados > 0) {
			this.ejemplaresPrestados -= cantidad;
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		String res;

		res = "Título: " + this.titulo + "\n";
		res += "Autor: " + this.AUTOR + "\n";
		res += "Ejemplares: " + this.ejemplares + "\n";
		res += "Ejemplares prestados: " + this.ejemplaresPrestados + "\n";
		res += "Género: " + this.genero + "\n";

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Libro l2 = (Libro) obj;

		if (this.titulo.equals(l2.titulo) && this.AUTOR.equals(l2.AUTOR)) {
			res = true;
		}
		return res;
	}
}
