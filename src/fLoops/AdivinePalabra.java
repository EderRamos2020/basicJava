package fLoops;
import libs.Input;
import javax.swing.*;
import java.util.Random;

public class AdivinePalabra {

    public static void main(String[] args) {

    int tamArray = Input.get_int("ingrese el tamaño del array de palabras ");
    //String tamaño = JOptionPane.showInputDialog("** ingrese el tamaño del array de nombres ** ");
    //int tamArray = Integer.parseInt(tamaño);
    String[] nombres = new String[tamArray];

    for(int j=0; j<nombres.length; j++ )
    {
       nombres[j]=Input.get_string("Digite el nombre a guardar en el array ");
       //nombres[j]=JOptionPane.showInputDialog(" Digite el nombre a guardar ");
    }

    //Random objeto = new Random();
    //int numeroSecreto = objeto.nextInt(nombres.length);
    int numeroSecreto = new Random().nextInt(nombres.length);
    String nombreSecreto = nombres[numeroSecreto];
    int letrascorrectas =0;

    char[] replicaNomSecret= new char[nombreSecreto.length()];
    for(int j=0; j<replicaNomSecret.length; j++)
    {
      replicaNomSecret[j]='*';
    }

    while(true)
    {

        char letraUsuario=Input.get_char("Digite la letra ");
        //String letra = JOptionPane.showInputDialog("Digite la letra ");
        //char letraUsuario=letra.charAt(0);

        for(int i=0; i<nombreSecreto.length(); i++)
        {
            char letraNombres=nombreSecreto.charAt(i);

            if(letraNombres==letraUsuario)
            {
                replicaNomSecret[i]=letraNombres;
                System.out.println("La palabra secreta va asi "+String.valueOf(replicaNomSecret));
                //JOptionPane.showMessageDialog(null, " El nombre secreto va asi » " + String.valueOf(replicaNomSecret) + " « \n ");



                letrascorrectas++;
                //break;

            }
        }
        if(letrascorrectas==nombreSecreto.length())
        {
            System.out.println("Advivinaste la palabra "+nombreSecreto+"!!");
            //JOptionPane.showMessageDialog(null, "Advivinaste el nombre secreto ¡¡ "+nombreSecreto+" !! ");
            break;
        }

    }
    //JOptionPane.showMessageDialog(null, "clic derecho");


    }
}
