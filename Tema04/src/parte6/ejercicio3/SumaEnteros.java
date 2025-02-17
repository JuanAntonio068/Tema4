package parte6.ejercicio3;

public class SumaEnteros {

	public int sumaEntero(int num) {
		int resultado = 0;

		if (num == 1) {
			resultado = 1;
		} else {
			resultado = num + sumaEntero(num - 1);
		}
		return resultado;
	}
	
	public int sumaEntero(int num1, int num2) {
		int resultado = 0;

		if (num2 == num1) {
			resultado = num1;
		} else {
			resultado = num2 + sumaEntero(num1, num2 - 1);
		}
		return resultado;
	}
}
