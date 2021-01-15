package mArrays;
import libs.Input;

public class OrdenarMenorMayor {

    static int[] valores;
    static int[] resulta;


    public static void main(String[] args)
    {

        int tam = Input.get_int("Digite el tamaño del Array ");
         valores = new int[tam];
         resulta =new int[tam];
         int max1;

        for (int i=0; i<valores.length; i++)
        {
            valores[i]=Input.get_int("Ingrese el valor en el indice " + i + " \n ");
        }

        max1=maximo();
        ordenar(max1);

    }

    public static int maximo()
    {
        int max=valores[0];
        for(int b=0; b<valores.length; b++)
        {
            if(valores[b]>max)
            {
                max=valores[b];
            }
        }
        return max;
    }

    public static void ordenar(int max)
    {
        int min1;
        int min;

        for(int a=0; a<resulta.length; a++)
        {
            min = max;
            for (int i = 0; i < valores.length; i++)
            {

                if (valores[i] < min)
                {
                    min1 = min;
                    min = valores[i];
                    valores[i] = min1;
                }
            }
            resulta[a] = min;
            Input.print( resulta[a] + " ");
        }

    }
}
