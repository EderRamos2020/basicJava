package mArrays;
import libs.Input;

import java.util.Arrays;
import java.util.Scanner;

public class VectoresPrimero {

    public static void main(String[] args){

        int conPares=0;
        int conImpares=0;

        System.out.println("Ingrese el tamaño de los array ");
        Scanner sca = new Scanner(System.in);
        int num=sca.nextInt();

        int[] vector1= new int[num];
        int[] vector2= new int[vector1.length];
        int[] result= new int[vector2.length];

        for(int i=0; i<vector1.length; i++)
        {
            vector1[i]= Input.get_int("Ingrese el numero del Vector1 ");
        }

        for(int j=0; j<vector2.length; j++)
        {
            vector2[j]=Input.get_int("Ingrese el numero del Vector2 ");
        }

        for(int k=0; k<result.length; k++)
        {
            result[k]=vector1[k]*vector2[k];
            int valorPos=result[k];

            if(valorPos%2 == 0)
            {
                Input.print("El numero "+result[k]+" es par \n");
            }
            else
            {
                Input.print("El numero "+result[k]+" es impar \n");
            }


            char[] valor=String.valueOf(valorPos).toCharArray();


            for(int l=0; l<valor.length; l++)
            {
                 if(valor[l]%2 == 0)
                 {
                     System.out.println("Posicion del Array "+k+" en el indice "+l+" es par ");
                     conPares=conPares+1;
                 }
                 else if(valor[l]%2 != 0)
                 {
                     System.out.println("Posicion del Array "+k+" en el indice "+l+" es impar ");
                     conImpares=conImpares+1;
                 }
            }



        }


        System.out.println(" El resultado es "+Arrays.toString(result));
        Input.print("caracteres pares "+conPares+"\n");
        Input.print("caracteres impares "+conImpares+"\n");



    }



}
