package jStrings;

import libs.Input;

public class ConvertirMinutosYSegundos {

    public static void main(String[] args) {
        int numeroMinutos;
        int numeroSegundos=0;
        int numeroTotalSegundos;

        if (numeroSegundos <= 59)
        {
            System.out.println("Cuantos minutos  y segundos: ");
            String minSeg = Input.get_string();

            //saca el numero de minutos del string, y lo convierte en numero
            numeroMinutos = sacarMinutos(minSeg);
            //saca el numero de segundos del string, y lo convierte en numero
            numeroSegundos = sacarSegundos(minSeg);

            numeroTotalSegundos = numeroMinutos * 60;
            numeroTotalSegundos += numeroSegundos;

            System.out.println("el numero total de segundos es " + numeroTotalSegundos);
        }
        else
        {
            System.out.println("dato incorrecto");
        }
    }

    private static int sacarSegundos(String minSeg)
    {
        return Integer.parseInt(minSeg.split(":")[1]);
    }

    private static int sacarMinutos(String minSeg)
    {
        return Integer.parseInt(minSeg.split(":")[0]);
    }




}
