package jStrings;

import libs.Input;

public class InicialesFacil {

    public static void main(String[] args) {

        System.out.println("Verifique las iniciales de su nombre ");
        String name=Input.get_string();
        int cantTot =name.length();
        Input.print("longitud: " + cantTot + "\n");
        int i=0;
        System.out.println(name.charAt(i));

/*
        for( i=1 ; i<cantTot ; i++)
        {
            if (name.charAt(i) == ' ')
            {
                char carIni=name.charAt(i + 1);
                Input.print("Letra inicial : "+ carIni);
            }

        }
*/
        for(i=0; i<=cantTot-1; i++)
        {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
            {
                Input.print("Mayus: " + name.charAt(i) + "\n");

            }
            else if  (name.charAt(i) == ' ')
                {
                    char carIni = name.charAt(i + 1);
                    Input.print(carIni + "\n");
                }

        }
        Input.print(name.split(" ") );

     }
}
