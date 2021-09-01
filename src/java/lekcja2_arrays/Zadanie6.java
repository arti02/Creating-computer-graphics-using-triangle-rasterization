package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie6 {
    public static void main(String[] args) {
        int []sd= new int[]{2,4,6,7,8};
        System.out.println(Arrays.toString(ops(sd)));

    }
    public static int[] ops(int[]arr){
        int r= arr.length-1;
        int[]da=new int[arr.length];
        for (int i=0;i<arr.length;i++){

            da[i]=arr[r];
            r--;

        }

            return da;
    }
}
