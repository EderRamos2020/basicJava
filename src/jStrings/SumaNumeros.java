package jStrings;

import libs.Input;

public class SumaNumeros {
    static int num;
    public static void main(String[] args) {


        int tope = getpositive();
        int i;
        int acumulador=0;
        int r=0;
        int factorial=1;

        for(i=1; i<=tope; i++ )
        {
            acumulador=acumulador+i;
        }
        Input.print("La suma de numeros de 1 a X es: " + acumulador + "\n" );
        System.out.println();

        Input.print("tabla de multiplicar de " + tope + "\n" );

        for(i=1; i<=tope;i++)
        {
            r=tope*i;
            System.out.println(tope + " x " + i + " = " + r);
        }
        System.out.println();

        for(i=1; i<=tope; i++)
        {
            factorial=factorial*i;
        }
        Input.print("El factorial de !" + tope + " es " + factorial);

    }

    public static int getpositive()
    {

        while(num<1)
        {
            System.out.println("Digite el tope numerico a sumar, positivo por favor");
            num=Input.get_int();

        }
        return num;
    }
}
