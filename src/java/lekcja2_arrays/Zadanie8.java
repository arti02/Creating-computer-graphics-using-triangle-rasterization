package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie8 {
    public static void main(String[] args) {
        int[] a = new int[]{23, 66, 67, 100};
        System.out.println(Arrays.toString(sl(a, 4, 56)));
    }

    public static int[] fg(int[] arr, int position, int number) {
        int[] f = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            f[i] = arr[i];
        }
        f[position] = number;
        return f;
    }

    public static int[] sl(int[] arr,int position,int number){
        int[]y=new int[arr.length+1];
        for (int i =0; i <position;i++){
            y[i]=arr[i];
        }
        y[position]=number;
        for(int i=position+1;i< y.length;i++){
            y[i]=arr[i-1];
        }
        return y;
    }
}
