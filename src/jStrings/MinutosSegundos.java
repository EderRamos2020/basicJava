package jStrings;

import libs.Input;

public class MinutosSegundos {

    //Imprimo el mensaje "duracion del video"
    //capturar el dato del usuario guardarlo en un string

    public static void main(String[] args) {

        String dura = Input.get_string(" Digite la duracion del video (mm:ss) :");
        String[] a =dura.split(":");
        String minutos = a[0];
        int minu = Integer.parseInt(minutos);
        int seguPar = minu*60;
        String segundos = a[1];
        int seg = Integer.parseInt(segundos);
        int seguTotal = seguPar + seg;
        Input.print("Total segundos con split "+seguTotal+"\n" );

        String minutos1="";
        String segundos1="";
        int minutos1Num=0;
        int segundos1Num=0;

        for(int i=0; i<dura.length(); i++)
        {
            if (dura.charAt(i) != ':' )
            {
                minutos1 = minutos1 + dura.charAt(i);
            }
            else
            {

                minutos1Num = Integer.parseInt(minutos1);
            }

        }
        int segundosParciales = minutos1Num * 60;


        int pos = dura.indexOf(":");
        for(int i=pos+1; i<dura.length(); i++ )
        {
            segundos1= segundos1 + dura.charAt(i);
        }
        segundos1Num = Integer.parseInt(segundos1);

        int totalSegundos = segundosParciales + segundos1Num;
        Input.print("Total de segundos con el for " + totalSegundos);
    }
}
