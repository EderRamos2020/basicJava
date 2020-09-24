package jStrings;

import libs.Input;
import java.util.Random;

public class ImprimirNombre {

    public static void main(String[] args) {

            System.out.println("EEEEEE  DDDDDD  EEEEEE  RRRRRR  ");
            System.out.println("EE       DD DD  EE      RR  RR    ");
            System.out.println("EEEEEE   DD DD  EEEEEE  RRRRRR    ");
            System.out.println("EE       DD DD  EE      RR RR        ");
            System.out.println("EEEEEE  DDDDDD  EEEEEE  RR  RR  ");
        System.out.println("  ");

        System.out.println("Adivine el numero secreto ");
        int a= Input.get_int();

        int numSec = new Random().nextInt(11)+1;

        if(a == numSec )
        {
            Input.print("Felicitaciones, el numero es: " + numSec);
        }
        else
        {
            Input.print("Fallaste el numero es: " + numSec);
        }



    }


}
