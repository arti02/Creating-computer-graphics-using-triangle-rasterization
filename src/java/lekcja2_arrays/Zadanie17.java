package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie17 {
    public static void main(String[] args) {
        int q[]=new int[]{12,45,-23,32,-34};
        System.out.println(Arrays.toString(as(q)));
    }
    public static int[] as(int []arr){
        int[]ad=new int[arr.length];
        int index1=0;
        int index2= arr.length-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<0){
               ad[index1]=arr[i];
               index1++;
            }else{
                ad[index2]=arr[i];
                index2--;
            }
        }
        return ad;
    }
}
