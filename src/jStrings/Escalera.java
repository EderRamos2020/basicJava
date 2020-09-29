package jStrings;

public class Escalera{

    public static void main(String[] args) {
        int altura = 3;
        int numeroRenglon = 0;

        while(numeroRenglon <= altura) {
            // System.out.println("Renglon " + numeroRenglon);
            // numeroRenglon += 1;
            //primero imprimo los espacios
            //cuantos espacios? altura - numeroRenglon
/*            int numeroEspacios = altura - numeroRenglon;
            int espacioActual = 0;
            while(espacioActual < numeroEspacios) {
                System.out.print(" ");
                espacioActual++;
            }
*/            //imprimo los gatos
            //cuantos gatos?  numeroRenglon
            int numeroGatos = numeroRenglon;
            int numeroActual = 1;
            while(numeroActual <= numeroGatos) {
                System.out.print(numeroActual);
                numeroActual++;
            }

            //salta al siguiente renglon
            System.out.println();
            numeroRenglon++;
        }
    }

}
