package hChars;

import libs.Input;

public class Ascii2 {

	public static void main(String[] args) {

		for(char a='!' ; a<='@'; a++ )
		{
			Input.print(a + " is " + (int)a + "\n");
		}


		for (char c = 'A'; c <= 'Z'; c++)
	    {
	        Input.print(c + " is " + (int) c + "\n" );
	    }

	}

}
