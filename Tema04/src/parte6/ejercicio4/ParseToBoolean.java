package parte6.ejercicio4;

public class ParseToBoolean {

	public boolean parseToBoolean(int n) {
		boolean res = false;
		
		if (n == 1) {
			res = true;
		}else if(n == 0) {
			res = false;
		}
		return res;
	}
	public boolean parseToBoolean(String cadena) {
		boolean res = false;
		
		if(cadena.equals("true")) {
			res = true;
		}else if (cadena.equals("false")){
			res = false;
		}
		return res;
				
	}
}
