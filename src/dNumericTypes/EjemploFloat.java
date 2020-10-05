package dNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
<<<<<<< HEAD:src/gNumericTypes/EjemploFloat.java

		System.out.println("digita el numero ");
		float f = Input.get_float();
		Input.print("Digite el segundo numero \n");
		float f2 = Input.get_float();
		Input.print("El resultado de f/f2 = " + (f/f2));
=======
		float f = Input.get_float("Dame un numero decimal: ");
		
		float f2 = Input.get_float("Dame un numero decimal: ");
		
		Input.print("f/f2 = " + (f/f2));
>>>>>>> upstream/master:src/dNumericTypes/EjemploFloat.java

	}

}
