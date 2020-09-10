package iLoops;

import libs.Input;



public class MarioFacilon1 {

     //private static int altura=10;
     static int n;


    public static void main(String[] args) {
        //int altura = 10;
        int altura= getpositive();
        int renglon = 1;
        while(renglon <= altura) {
            int numGatos = renglon ;
            imprimirEspacios(altura, numGatos);
            imprimirGatos(numGatos);
            Input.print("  ");
            imprimirGatosDerecha(numGatos);
            imprimirEspaciosDerecha(altura, numGatos);
            System.out.println();
            renglon++;
        }

    }

    private static void imprimirEspacios(int altura, int numGatos) {
        int numEspacios = altura - numGatos;
        int numEspaciosActual = 0;
        while(numEspaciosActual < numEspacios) {
            Input.print(" ");
            numEspaciosActual++;
        }

    }

    private static void imprimirGatos(int numGatos) {
        int numeroActualGatos = 0;
        while(numeroActualGatos < numGatos) {
            Input.print("#");
            numeroActualGatos++;
        }
    }

    private static void imprimirGatosDerecha(int numGatos)
    {
        int numGatActDer=0;
        while (numGatActDer < numGatos)
        {
            System.out.print("#");
            numGatActDer += 1;

        }
    }


    private static void imprimirEspaciosDerecha(int altura, int numGatos)
    {
        int numEspDer = altura - numGatos;
        int numEspActDer = 0;
        while(numEspActDer < numEspDer)
        {
            Input.print(" ");
            numEspActDer++;
        }
    }

    public static int getpositive()
    {

        while(n<1)
        {
            System.out.println("Digite la altura : ");
            n = Input.get_int();
        }
        return n;

    }
    //private
    public static int getnegative()
    {
        while(n > -1)
        {
            System.out.println("Digite el numero negativo: ");
            n=Input.get_int();
        }
        return n ;
    }



}






















