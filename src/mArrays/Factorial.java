package mArrays;
import libs.Input;
import java.util.Scanner;

public class Factorial {

    //static int num;

    public static void main(String[] args) {

        Input.print("# factorial: ");
        int num2=getPositiv();
        factorial(num2);
        System.out.println();

        System.out.println("Exponentes ");
        System.out.print("Digite el numero base: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int ex = Input.get_int("Digite el exponente: ");
        elevado(b,ex);

        int n = Input.get_int("Serie de Fibonnaci : ");
        fibonacci(n);

    }

    public static void factorial(int dig)
    {

        int a=dig;
        long b=dig;
        do {
            a--;
            b=b*a;
        }while (a>1);

        System.out.println("El factorial de "+dig+" es "+b);

    }

    public static void elevado(int base, int exp)
    {
        int con = 1;
        int r = base;

        while(con<exp)
        {
            r=r*base;
            con++;
        }

        System.out.println("El No. "+base+" elevado "+exp+" = "+r);
        System.out.println();
    }

    public static void fibonacci(int lim)
    {
        int a=0;
        int b=1;
        System.out.print(" "+b+" ");
        int c=0;

        while(c<lim)
        {
            c=b+a;
            a=b;
            b=c;
            if(c<lim)
            {
                Input.print(c + " ");
            }
        }
    }

    public static int getPositiv()
    {
     int num=0;
     while(num<1)
    {

        num = Input.get_int("Digite un numero positivo: ");

    }
    return num;
    }


}
