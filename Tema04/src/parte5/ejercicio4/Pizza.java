package parte5.ejercicio4;

public class Pizza {

	private int cod;

	private Tamaño tamaño;

	private Tipo sabor;

	private Estado estado = Estado.PEDIDA;

	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Constructor para la clase pizza
	 * 
	 * @param cod    El código de la pizza
	 * @param tamaño El tamaño de la pizza
	 * @param sabor  El sabor de la pizza
	 */
	public Pizza(int cod, String tamaño, String sabor) {

		if (cod > 0) {
			this.cod = cod;
		}
		switch (tamaño) {
		case "Familiar" -> this.tamaño = Tamaño.FAMILIAR;

		default -> this.tamaño = Tamaño.MEDIANA;
		}

		switch (sabor) {
		case "Margarita" -> this.sabor = Tipo.MARGARITA;

		case "Cuatro quesos" -> this.sabor = Tipo.CUATROQUESOS;

		default -> this.sabor = Tipo.FUNGHI;
		}
	}

	/**
	 * Devuelve el estado
	 * 
	 * @return El estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Modifica el estado
	 * 
	 * @param estado El nuevo estado de la pizza
	 */
	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado);
	}

	/**
	 * Devuelve el código
	 * 
	 * @return El código de la pizza
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * Devuelve el tamaño
	 * 
	 * @return El tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * Devuelve el sabor
	 * 
	 * @return El sabor de la pizza
	 */
	public Tipo getSabor() {
		return sabor;
	}

	@Override
	public String toString() {
		String res;

		res = this.cod + ": " + this.tamaño + " - " + this.sabor + " - " + this.estado;

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Pizza p2 = (Pizza) obj;

		if (this.cod == p2.cod) {
			res = true;
		}

		return res;
	}
}
