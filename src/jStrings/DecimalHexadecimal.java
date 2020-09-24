package jStrings;

import libs.Input;

public class DecimalHexadecimal {

    static int a;
    public static void main(String[] args) {



        int dividendo = hexadecimal();

        while(dividendo < 16)
        {
            int  mod = dividendo % 16;
            Input.print(mod + ".");
            dividendo=(dividendo/16);
        }


    }

    public static int hexadecimal()
        {
            do
            {
                System.out.println("digite el numero a convertir a hexadecimal mayor a 16");
                a= Input.get_int();
            }while (a<16);
            return a;
        }

}
