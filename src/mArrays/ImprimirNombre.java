package mArrays;
import java.sql.SQLOutput;
import java.util.Scanner;
import libs.Input;

public class ImprimirNombre {

    public static void main(String[] args) {

        System.out.println("*** Digite alguna de la opcines ***");
        System.out.println(" 1 para Imprimir el nombre ");
        System.out.println(" 2 para tabla de multiplicar ");
        System.out.println(" 3 para Calcule la media ");
        Scanner sc = new Scanner(System.in);
        int dato=sc.nextInt();

        switch(dato)
        {
            case 1 :
                String nom=Input.get_string("Digite el nombre ");
                nombres(nom);
                break;

            case 2 :
                int numero=Input.get_int("*** tabla de multiplicar ");
                tablaMultiplicar(numero);
                break;

            case 3 :
                int cant=Input.get_int("Digite la cantidad de valores ");
                Input.print("Promedio de valores "+promedio(cant));
                break;

        }

    }

    public static int promedio(int cant) {
        int cont=0;
        int acumulador=0;
        while(cont<cant)
        {
            int valor=Input.get_int("Digite el valor ");
            acumulador=acumulador+valor;
            cont++;
        }
        int resultado=acumulador/cant;

        return resultado;
    }

    public static void tablaMultiplicar(int number)
    {
        int cont=0;
        while(cont<11)
        {
            if (number > 0)
            {
                int resultado = number * cont;
                System.out.println(number + " * " + cont + " = " + resultado);
            }
            cont++;
        }
    }

    public static void nombres (String texto)
    {
        System.out.println(" "+texto);
        String frase=texto.replaceAll(" ", "█");
        char[] arrayFrase=frase.toCharArray();

        for(int i=0; i<arrayFrase.length; i++)
        {
            Input.print(i+" "+arrayFrase[i]+"\n");
        }
    }




}
