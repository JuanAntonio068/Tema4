package parte6.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {

	static Random rand = new Random();
	
	public void numerosAleatorios(int n) {
		double aleatorio;
		
		aleatorio = rand.nextDouble(0, 1);
		
		if(n == 1) {
			System.out.println(aleatorio);
		}else {
			System.out.println(aleatorio);
			numerosAleatorios(n - 1);
		}
	}
	
	public void numerosAleatorios(int cantidad, int max) {
		int aleatorio;
		
		aleatorio = rand.nextInt(0, max);
		
		if(cantidad == 1) {
			System.out.println(aleatorio);
		}else {
			System.out.println(aleatorio);
			numerosAleatorios(cantidad - 1, max);
		}
	}
	
	public void numerosAleatorios(int cantidad, int min, int max) {
		int aleatorio;
		
		aleatorio = rand.nextInt(min, max);
		
		if(cantidad == 1) {
			System.out.println(aleatorio);
		}else {
			System.out.println(aleatorio);
			numerosAleatorios(cantidad - 1, min,  max);
		}
	}
}
