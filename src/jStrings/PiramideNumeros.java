package jStrings;
import libs.Input;

public class PiramideNumeros {

    static int n;

    public static void main(String[] args) {

        int alt = getpositive();
        int ren = 1;

        while (ren <= alt)
        {
            int esp = alt - ren;
            espacios(esp);
            numizq(ren);
            numder(ren);
            System.out.println();
            ren++;
        }
    }

    public static void espacios(int esp)
    {
        int fi = 1;
        while (fi<=esp)
        {
            System.out.print(" ");
            fi++;
        }
    }

    public static void numizq(int ren)
    {
        int con=1;
        while(con <= ren)
        {
            System.out.print(ren);
            con++;
        }

    }

    public static void numder(int ren)
    {
        int con=2;
        while(con <= ren)
        {
            System.out.print(ren);
            con++;
        }

    }

        public static int getpositive()
        {
            while(n<1)
            {
                n = Input.get_int("Digite una altura ");
            }
            return n;
        }

    }

