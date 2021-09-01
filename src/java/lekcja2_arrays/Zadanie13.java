package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie13 {
    public static void main(String[] args) {
        int []df=new int[]{2,2,4,5,4,2,4};
        System.out.println(Arrays.toString(ass(df, 2)));
    }
    public static int sp(int[]arr,int a){
        int d=0;
        for (int i=0;i<arr.length;i++){
            if(a==arr[i]){
                d++;
            }
        }
        return d;


    }
    public static int[] ass(int[]arr,int a){
        int d=sp(arr,a);
        int []f=new int[arr.length-d];
        int q=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]!=a){
                f[q]=arr[i];
                q++;
            }
        }
        return f;
    }
}
