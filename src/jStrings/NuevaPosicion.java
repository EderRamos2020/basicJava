package jStrings;
import libs.Input;

public class NuevaPosicion {

    public static void main(String[] args) {

        System.out.println("digite las palabras: ");
        String name=Input.get_string();
        int charTotal=name.length();
        int nueva=1;
        int i=1;
        int act=0;
        int sum=0;
/*
        while(i<charTotal)
        {
            if(name.charAt(i) == ' ')
            {
                act=act+1;
            }
            i++;
        }


        System.out.print(name.charAt(0));
        int pos=name.indexOf(" ");
        sum=sum+1;
        Input.print(name.charAt(pos+1));


        while(sum < act )
        {

            nueva = name.indexOf(" ", pos+1);
            sum =sum +1;
            Input.print(name.charAt(nueva+1));
            pos=nueva+1;

        }
*/

        System.out.print(name.charAt(0));
        int pos=name.indexOf(" ");
        Input.print(name.charAt(pos+1));
        i=pos+1;

        while(i<charTotal)
        {
            if(name.charAt(i)== ' ')
            {
                nueva =name.indexOf(" ", pos+1);
                Input.print(name.charAt(nueva+1));
                pos=nueva+1;

            }
            i++;

        }









    }

}
