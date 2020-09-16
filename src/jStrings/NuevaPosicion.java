package jStrings;
import libs.Input;

public class NuevaPosicion {

    public static void main(String[] args) {

        System.out.println("digite sus nombres completos: ");
        String name=Input.get_string();
        int charTotal=name.length();
        int nueva=0;

        System.out.print(name.charAt(0));
        int pos=name.indexOf(" ");
        Input.print(name.charAt(pos+1));

        //while(pos<charTotal)
        while(nueva >= 0)
        {

            nueva = name.indexOf(" ", pos+1);
            Input.print(name.charAt(nueva+1));
            pos=nueva+1;

        }



    }

}
