package mArrays;
import libs.Input;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double numnegativos=0;
        double numpositivos=0;
        double acumula=0;
        int cont=0;
        int num=0;
        int par=0;

        System.out.println("digite el tamaño del array");
        Scanner sca = new Scanner(System.in);
        int tam = sca.nextInt();
        int[] numeros = new int[tam];

        for(int i=0; i<numeros.length; i++)
        {
            numeros[i]= Input.get_int("digite el numero positivo o negativo");
        }

        for (int numeral : numeros) {

            if (numeral < 0) {
                numnegativos = numnegativos + numeral;
                cont++;
            } else {
                numpositivos = numpositivos + numeral;
                num++;
            }

        }

        System.out.println("la media negativa es "+numnegativos/cont);
        System.out.println("la media positiva es "+numpositivos/num);

        for(int i=0; i<numeros.length; i++)
        {
            if(numeros[i]%2==0)
            {
                acumula = acumula + numeros[i];
                par++;
            }
        }

        System.out.println("la media de posiciones pares es: " +acumula/par);
    }


}
