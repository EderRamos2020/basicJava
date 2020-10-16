package mArrays;
import libs.Input;
import java.util.Arrays;


public class SumarArray {

    public static void main(String[] args) {

        int tam= Input.get_int("Digite el tamaño del Array : ");
        int[] nums = new int[tam];
        int[] nums1 = new int[tam];

        for(int i=0; i<tam; i++)
        {
            nums[i] = Input.get_int("Digite el valor del indece " + i + " : \n ");
        }

        int max =nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        for(int i=0; i< nums1.length; i++)
        {
            int com=max;
            for(int a=0; a<nums.length; a++)
            {

                if( nums[a] < com)
                {
                    int val=com;
                    com = nums[a];
                    nums[a] = val;
                }
            }
            nums1[i]=com;
        }
        System.out.println("valores como String "+ Arrays.toString(nums1));

        int suma=0;
        for (int num : nums1) {
            suma = suma + num;
        }
        Input.print("suma de valores : "+suma+ " \n ");

    }

}
