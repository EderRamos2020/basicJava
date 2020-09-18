package jStrings;


import libs.Input;

public class inicialesDificil {

    public static void main(String[] args) {

        System.out.println("Ingrese los nombres separados por '/' ");
        String name=Input.get_string();
        Input.print(name.split("/"));
        String[] letras= name.split("/");

        System.out.println("Ingrese hora:minutos:segundos");
        String cadena = Input.get_string();
        String[] tiempo = cadena.split(":");
        Input.print(" "+tiempo);

        System.out.println("ingrese varios espacion y numeros");
        String numberString = Input.get_string();
        Input.print(numberString.trim()+"\n");

        System.out.println("string para convertir a int ");
        String numberSt = Input.get_string();
        int number=Integer.parseInt(numberSt);

    }

}
