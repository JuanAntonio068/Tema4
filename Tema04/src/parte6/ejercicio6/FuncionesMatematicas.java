package parte6.ejercicio6;

public class FuncionesMatematicas {

	public int sumatorio(int numero) {
		int res = 0;
		
		if(numero == 0){
			res = 0;
		}else {
			res = numero + sumatorio(numero - 1);
		}
		return res;
	}
	
	public double potencia(double a, int n) {
		double res = 0;
		
		if (a == 0){
			res = 1;
		}else {
			res = n * potencia(a - 1, n);
		}
		return res;
	}
	
	public int serieFibonacci(int numero) {
		int res = 0;
		
		if(numero == 0 || numero == 1) {
			res = 1;
		}else {
			res = serieFibonacci(numero - 1) + serieFibonacci(numero -2);
		}
		return res;
	}
}
