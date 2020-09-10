package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {

		System.out.println("digita el numero ");
		float f = Input.get_float();
		Input.print("Digite el segundo numero \n");
		float f2 = Input.get_float();
		Input.print("El resultado de f/f2 = " + (f/f2));

	}

}
