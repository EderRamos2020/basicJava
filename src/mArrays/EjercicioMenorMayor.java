package mArrays;

import libs.Input;

public class EjercicioMenorMayor {

    public static void main(String[] args) {

        //Ejercicio de array digitando el tamaño y llenando posicion por posicion
        int tam = Input.get_int(" digite el tamaño del array \n ");
        int[] crear = new int[tam];

        for (int i=0; i<crear.length; i++)
        {
            crear[i]= Input.get_int("Digite el valor de la posicion " + i + "\n");
        }

        // pasando valores de un array a otro y acumulandolo en un string
        String result = "";
        int[] replica = new int[crear.length];
        for(int i=0; i<replica.length; i++)
        {
            replica[i]=crear[i];
            System.out.println(" datos "+replica[i]);
            result =  result + replica[i];
        }
        System.out.println();
        Input.print("total string " + result );


        //Ejercicio de hallar el menor
        int[] num = {6,5,4,9,8,7,3,2,10};
        int var = num[0];

        for(int i=0; i<num.length; i++)
        {
            if (num[i] < var)
            {
                var = num[i];
            }

        }
        System.out.println("El numero menor es " + var);

        //Ejercicio de hallar el mayor
        int max =0;
        for(int i=0; i<num.length; i++)
        {
            if (num[i] > max)
            {
                max= num[i];
            }
        }
        System.out.println("El numero mayor es " + max);
    }

}
