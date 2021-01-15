package mArrays;
import java.util.Scanner;

public class Arbol {

    public static void main(String[] args) {

        System.out.println(" Arbolito ");

        for(int x=1; x<=20; x+=2)
        {
            for(int j=1; j<=20-x; j+=2)
            {
                System.out.print(" ");
            }
            for(int n=1; n<=x; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("         ***");

    }

}
