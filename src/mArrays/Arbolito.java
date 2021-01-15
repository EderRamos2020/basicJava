package mArrays;
import libs.Input;
import java.util.Scanner;

public class Arbolito {

    public static void main (String[] args)
    {
        System.out.println("la altura del arbolito ");
        Scanner sc = new Scanner(System.in);
        int tam=sc.nextInt();

        int num =tam;
        int num2 =1;
        for (int i=0; i<=tam; i++)
        {
            for (int j=0; j<=num; j++)
            {
                Input.print(" ");
            }
            num--;


            for (int k=0; k<num2; k++)
            {
                System.out.print("*");
            }
            num2+=2;
            System.out.println();
        }

        for(int c=0; c<2; c++)
        {
            for (int a = 0; a < tam; a++)
            {
                System.out.print(" ");
            }
            for (int b = 0; b < 3; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
