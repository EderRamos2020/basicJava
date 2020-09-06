package gNumericTypes;

import libs.Input;

public class BotellaAgua
{
    static int numeroMinutos;
    static int numeroBotellas;
    static int n;

    public static void main(String[] args)
    {


       //System.out.println("digite la cantidad de tiempo en la ducha ");
       //numeroMinutos = Input.get_int();
        numeroMinutos = getpositive();
        if(numeroMinutos >= 0)
        {
            numeroBotellas=numeroMinutos * 12;
            System.out.println("cantidad de botellas"+numeroBotellas);
        }else
        {
            System.out.println("Numero fallido");
        }


    }

    private static int getpositive ()
    {
        while (n < 1 )
        {
            System.out.println("digite el tiempo en la ducha ");
            n=Input.get_int();

        }
            return n;

    }

}

