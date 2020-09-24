package jStrings;

import libs.Input;

public class Segundos {

    public static void main(String[] args) {


        int segundos;
        double minutos;
        double converse=0.017;

        System.out.println("Ingrese la cantidad de segundos a convertir: ");
        segundos= Input.get_int();

        minutos= segundos / 60;
        int seg= segundos % 60 ;
        Input.print( String.format("el resultado es %.0f", minutos) + ":" + seg);


    }
}
