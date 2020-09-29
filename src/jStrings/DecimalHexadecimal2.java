package jStrings;

import libs.Input;
import java.util.ArrayList;
import java.util.List;

public class DecimalHexadecimal2 {

    static int n;
    public static void main(String[] args) {

        int i;
        int dividendo = hexadecimal();
        List<String> acu = new ArrayList<String>();

        do
        {
            String mod = String.valueOf(dividendo % 16);
            acu.add(mod);
            dividendo=(dividendo/16);

        }while(dividendo>15);

        String divi= String.valueOf(dividendo);
        //String divi= Integer.toString(dividendo);
        acu.add(divi);
        int tamaño=acu.size();

        for(i=tamaño-1; i>=0; i--)
        {
            int dato=Integer.parseInt(acu.get(i));
            if(dato == 10)
            {
                Input.print("A" + ",");
            }
            else if(dato == 11)
            {
                Input.print("B" + ",");
            }
            else if(dato == 12)
            {
                Input.print("C" + ",");
            }
            else if(dato == 13)
            {
                Input.print("D" + ",");
            }
            else if(dato == 14)
            {
                Input.print("E" + ",");
            }
            else if(dato == 15)
            {
                Input.print("F" + ",");
            }
            else
            {
                Input.print( dato + ",");
            }


        }



    }

    public static int hexadecimal()
    {
        while(n<16)
        {
            System.out.println("Digite el numero a convertir a hexadecimal ");
            n = Input.get_int();
        }
        return n;
    }
}
