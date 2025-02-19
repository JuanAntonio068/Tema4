package parte6.ejercicio4;

public class PrincipalParseToBoolean {

	public static void main(String[] args) {

		//Llamamos al objeto
		ParseToBoolean pTB = new ParseToBoolean();
		
		//Variable para guardar un número
		int n = 1;
		
		//Variable para guardar una cadena
		String cadema= "true";
		
		//Imprimimos el resultado de las funciones
		System.out.println(pTB.parseToBoolean(n));
		
		System.out.println(pTB.parseToBoolean(cadema));
	}

}
