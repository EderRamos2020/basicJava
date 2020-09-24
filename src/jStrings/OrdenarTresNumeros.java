package jStrings;

import libs.Input;

public class OrdenarTresNumeros
{

    public static void main(String[] args)
    {

        System.out.println("Digite los tres numeros a ordenar: ");
        int a = Input.get_int();
        int b = Input.get_int();
        int c = Input.get_int();

        if (a < b)
        {
            if (a < c) {
                        Input.print(a + ",");
                        if (b < c) {
                        Input.print(b + "," + c);
                        } else {
                        Input.print(c + "," + b);
                        }
            } else if (c < a)
                   {
                     Input.print(c + "," + a + "," + b);
                   }
                    else
                    {
                        Input.print(a + "," + c + "," + b);
                    }
        } else if (b < a)
               {
                            if (b < c)
                            {
                                Input.print(b + ",");
                                if (a < c) {
                                    Input.print(a + "," + c);
                                } else {
                                    Input.print(c + "," + a);
                                }
                            }
                            else if (c < b)
                                 {
                                     Input.print(c + "," + b + "," + a);
                                 }
                                 else
                                 {
                                     Input.print(b + "," + c + "," + a);
                                 }
               } else if (a == b)
                      {
                          if (a < c)
                          {
                          Input.print(a + "," + b + "," + c);
                           }
                           else if(c < a)
                                {
                                 Input.print(c + "," + a + "," + b);
                                 }
                                else
                                {
                                System.out.println(" todos son iguales ");
                                }
                      } else if (a == c)
                             {
                             Input.print(b + "," + a + "," + c);
                             }
    }
}
