package jStrings;

import libs.Input;

public class NombreAlreves {

    public static void main(String[] args) {

        System.out.println("Digite el nombre ");
        String name=Input.get_string();
        int longitud=name.length();
        int i;


        for(i=longitud-1; i>=0; i--)
        {
            if(i == (longitud-1))
            {
                char a = name.charAt(i);
                int c =((int)a-32);
                Input.print( (char)c );

            }
            else
                {
                Input.print(name.charAt(i));
            }
        }
        System.out.println();
    }
}
/*
String[] termino= {"Hola","mundo","for","while","int","String"};
String dato=termino[numeroSecreto];
 */