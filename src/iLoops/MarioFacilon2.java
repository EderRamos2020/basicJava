package iLoops;

import libs.Input;

public class MarioFacilon2
{
    static int n;

        public static void main(String[] args)
        {
        int altura = getpositive();
        int renglon = 1;

            while (renglon <= altura)
            {
            int numGatos = renglon;
            //imprimirEspacios(altura, renglon);
            //imprimirGatos(renglon);

            imprimirGatIz(altura, numGatos);
            imprimirEspIz(numGatos);
            imprimirEspDer(numGatos);
            imprimirGatDer(altura, numGatos);
            //imprimirGatAb(numGatos);
            System.out.println();

            renglon++;

            }

            while(renglon <= altura)
            {
                int numGatos = renglon;
                imprimirGatAb(numGatos);
            }

        }
/*

      //public static int
        private static void imprimirEspacios(int altura, int numGatos)
        {
          int numEspaciosActual=0;
          int numEspacios= altura - numGatos;
          do
          {
              System.out.print(" ");
              numEspaciosActual +=1;

          }while(numEspaciosActual <= numEspacios);
        }

   /*
        private static void imprimirGatos (int numGatos)
        {
          int numGatosActual=0;
          while(numGatosActual<numGatos)
          {
              Input.print("#");
              numGatosActual++;
          }

        }
    */

        private static void imprimirGatIz(int altura, int numGatos)
        {
            int numGat=altura-numGatos;
            int contNumGat=0;
            while(contNumGat<numGat)
            {
                Input.print("#");
                contNumGat += 1;

            }

        }

        private static void imprimirEspIz(int numGatos)
        {
            int numEsp=0;
            while(numEsp<numGatos)
            {
                System.out.print(" ");
                numEsp += 1;
            }
        }

        private static void imprimirEspDer( int numGatos)
        {

            int contNumGat2=0;
            while(contNumGat2<numGatos)
            {
                Input.print(" ");
                contNumGat2++;

            }
        }

        private static void imprimirGatDer(int altura, int numGatos)
        {
            int contNumGat =0;
            int numGatTot=altura-numGatos;
            while(contNumGat<numGatTot)
            {
                Input.print("#");
                contNumGat += 1;
            }

        }

        private static void imprimirGatAb(int numGatos)
        {
            int contNumGat=0;
            while(contNumGat<numGatos)
            {
                System.out.print("#");
                contNumGat += 1;

            }
        }


        //private
        public static int getpositive()
        {
            do
            {
                System.out.println("Digite el numero");
                n= Input.get_int();

            }while(n<1);
            return n;
        }


}
