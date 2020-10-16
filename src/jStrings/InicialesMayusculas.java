package jStrings;
import libs.Input;

public class InicialesMayusculas {

    public static void main(String[] args) {

        System.out.println("Digite la frase : ");
        String frase = Input.get_string();
        int esp =0;
        int con =0;
        int letra;


        int pos=0;
        Input.print(frase.charAt(pos));

        int ind= frase.indexOf(" ");
        Input.print(frase.charAt(ind+1));


        for(int i=0; i<frase.length(); i++)
        {
            if(frase.charAt(i) == ' ')
            {
                esp = esp+1;
            }
        }

        while(con < esp-1)
        {

            ind= frase.indexOf(" ",ind+1);
            letra= ind+1;
            Input.print(frase.charAt(letra));
            con=con+1;
        }
    }
}
