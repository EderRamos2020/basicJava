package iLoops;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import libs.Input;

public class CancionElefante {

    public static void main(String[] args) {

        int numEle =1;
        int numTot =0;

        Input.print("Cuantos elefantes quieres ");
        numTot = Input.get_int();


            while (numEle <= numTot) {
                if(numEle == 1)
                {
                    Input.print(numEle + " elefante se columpiaba sobre la tela de una araña,\n" +
                            "como veia que resistia, fue a llamar a otro elefante \n");
                    Input.print(" ");
                } else
                {
                Input.print(numEle + " elefantes se columpiaban sobre la tela de una araña,\n" +
                        "como veian que resistia, fueron a llamar a otro elefante \n");
                Input.print(" ");
                }
                numEle += 1;

            }

        }

    }
