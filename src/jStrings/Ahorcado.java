package jStrings;

import libs.Input;

import java.util.Random;

public class Ahorcado {

    public static void main(String[] args) {

        String[] termino= {"Hola","mundo","for","while","int","String"};
        int a=termino.length;

        int numeroSecreto = new Random().nextInt(termino.length);
        String dato=termino[numeroSecreto];

        System.out.println("Adivine la palabra secreta");
        String vocablo= Input.get_string();

        //if(vocablo.equals(dato) )
        if(dato.equalsIgnoreCase(vocablo))
        {
            System.out.println(" Yupi... Ganaste!!");
        }
        else
            {
            System.out.println("Ups... perdiste!!");
        }

    }
}
