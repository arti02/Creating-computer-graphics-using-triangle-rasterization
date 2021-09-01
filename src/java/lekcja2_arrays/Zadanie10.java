package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie10 {
    public static void main(String[] args) {
        int[] d=new int[]{4,8,10,9,6,8};
        add(d,3);
    }
    public static void add(int[]arr, int a){
        int[] ar=new int[arr.length-1];
        for (int i=0;i<a;i++){
            ar[i]=arr[i];
        }
        for (int i=a;i< ar.length;i++){
            ar[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(ar));
    }
}
