package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {

		for(int a=0 ; a<65; a++)
		{
			char b = (char) a ;
			Input.print( a + " en ASCII es " + b + "\n");
		}


	    for (int i = 65; i < 65 + 26; i++)
	    {
	        Input.print((char) i + " is " + i + "\n");
	    }



	}

}
