package mArrays;
import java.util.Scanner;
import java.util.Arrays;
import libs.Input;

public class CuantasVeces {

    public static void main(String[] args) {

        System.out.println("*** buscar Numero repetido ***");
        System.out.println("Digite el tamaño del Array ");
        Scanner sc = new Scanner(System.in);
        int tam =sc.nextInt();


        int[] Array = new int[tam];
        int[] vector=llenarArray(Array);

        int numAdivinar=Input.get_int("Digite el numero que desea buscar ");
        int NumVeces=buscarNumeroRepetido(vector,numAdivinar);
        Input.print("el numero se repite "+NumVeces+ " veces \n");


        System.out.println("*** Determinar posiciones en Array ***");
        int tamArray = Input.get_int("Digite la extension del Array ");

        int[] arrayNum = new int[tamArray];
        int[] arrayLleno= llenarArray(arrayNum);

        System.out.println("resultados de Array  "+Arrays.toString(validarPosiciones(arrayLleno,tamArray)));
        Input.print("resultados del Vector "+Arrays.toString(validarPosiciones(vector,tam)));


    }


    public static int[] llenarArray(int[] Array)
    {
        for(int i=0; i<Array.length; i++)
        {
            Array[i]=Input.get_int("Digite el valor a guardar ");
        }
        return Array;
    }


    public static int buscarNumeroRepetido(int[]Array1, int numBuscar)
    {
        int veces=0;
        for(int j=0; j<Array1.length; j++)
        {
            if(Array1[j]==numBuscar)
            {
                veces++;
            }
        }
        return veces;
    }

    public static int[] validarPosiciones (int[] arrayLlenoPosiciones, int tamArray)
    {
        if(arrayLlenoPosiciones[0]==0)
        {
            Input.print("EL array tiene un 0 en la 1era posicion \n");
        }
        else
        {
            Input.print("EL array en el indice 0 No es 0 \n");
        }
        if(arrayLlenoPosiciones[tamArray-1]>0)
        {
            Input.print("El array tiene un positivo en la ultima posicion \n");
        }
        else
        {
            Input.print("El array No tiene un positivo en la ultima posicion \n");
        }

        int[] arrayFinal= {arrayLlenoPosiciones[0],arrayLlenoPosiciones[tamArray-1]};
        return arrayFinal;
    }

}
