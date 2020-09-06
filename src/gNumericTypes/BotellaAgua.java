package gNumericTypes;

import libs.Input;

public class BotellaAgua
{
    static int numeroMinutos;
    static int numeroBotellas;

    public static void main(String[] args)
    {

       System.out.println("digite la cantidad de tiempo ");
       numeroMinutos = Input.get_int();
        if(numeroMinutos >= 0)
        {
            numeroBotellas=numeroMinutos * 12;
            System.out.println("cantidad de botellas"+numeroBotellas);
        }else
        {
            System.out.println("Numero fallido");
        }

    }

}

