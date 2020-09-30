package jStrings;

import libs.Input;

public class Escalera2 {

    static int total=0;
    static int renglon =1;
    static int i=1;
    public static void main(String[] args) {

        System.out.println("Ingrese la altura");
        int alt = Input.get_int();
        //int esp = alt-1;

        while(renglon <= alt)
        {
                 //total=alt-esp;
                 numeros(renglon);
                 System.out.println();
                 //esp--;
                 renglon++;
        }

    }

    public static void numeros(int renglon)
    {
        int cant=1;

        while (cant <= renglon) {

            //Input.print(cant);
            //Input.print(renglon);
            Input.print(i);
            i++;
            cant++ ;

            }

    }
}
