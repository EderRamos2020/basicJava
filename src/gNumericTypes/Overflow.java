package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1;
	    for (int i = 0; i < 64; i++)
	    {
	    	System.out.print("dato : " + i + "  n: " + n + "\n");
	        n = n * 2;
	    }
	}
}



