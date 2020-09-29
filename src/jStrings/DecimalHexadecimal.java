package jStrings;

import libs.Input;

public class DecimalHexadecimal {

    static int a;

    public static void main(String[] args) {



        int dividendo = hexadecimal();
        int i=0;
        System.out.println("Ingrese la cantidad de digitos del numero");
        int n= Input.get_int();
        int[] m=new int[n];
        int  mod;

        do
        {


            mod = dividendo % 16;
            Input.print(mod + ".");
            m[i]= mod;
            dividendo=(dividendo/16);
            i++;

        }while(dividendo > 16);
        //i++;
        Input.print(dividendo + "\n");
        m[i]= dividendo;

        for(i=m.length-1; i>=0; i--)
        {

            if (m[i]==10)
            {
                Input.print("A"+" ");
            }
            else if(m[i]==11)
            {
                Input.print("B"+" ");
            }
            else if(m[i]==12)
            {
                Input.print("C"+" ");
            }
            else if(m[i]==13)
            {
                Input.print("D"+" ");
            }
            else if(m[i]==14)
            {
                Input.print("E"+" ");
            }
            else if(m[i]==15)
            {
                Input.print("F"+" ");
            }
            else if (m[i]==' ')
            {
                Input.print(" ");
            }
            else
            {
                Input.print(m[i]+" ");
            }

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
