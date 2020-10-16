package jStrings;
import libs.Input;

public class HorasMinutosSegundos {

    static String dura = Input.get_string(" Digite la duracion del video (hh:mm:ss) : ");
    static int pos = dura.indexOf(":");
    static String hor="";
    static  int pos1= dura.indexOf(":", pos+1);
    static String min = "";
    static int segHor =0 ;
    static int segMin=0;
    static String seg = "";
    static int segNum =0;

    public static void main(String[] args) {

        metSegHor(pos);
        metSegMin(pos, pos1);
        metSegNum(pos1);

        int segTotal= metSegHor(pos) + metSegMin(pos, pos1) + metSegNum(pos1);
        Input.print("Total segundos "+segTotal);
    }


    private static int metSegHor (int pos)
    {
        for(int i=0; i<pos; i++)
        {

            hor = hor + dura.charAt(i);
        }
        int horNum=Integer.parseInt(hor);
        segHor = horNum * 3600;
        return segHor;
    }

    private static int metSegMin (int pos, int pos1)
    {
        for(int i=pos+1; i<pos1; i++ )
        {
            min= min + dura.charAt(i);
        }
        int minHor = Integer.parseInt(min);
        segMin=minHor * 60;
        return segMin;
    }

    private static int metSegNum (int pos1)
    {
        for(int i=pos1+1; i<dura.length(); i++ )
        {
            seg= seg + dura.charAt(i);
        }
        segNum = Integer.parseInt(seg);
        return segNum;
    }
}
