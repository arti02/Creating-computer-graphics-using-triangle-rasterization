package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie12 {
    public static void main(String[] args) {
        int[] d= new int[]{14,25,80,53,86,7,2};
        System.out.println(Arrays.toString(fac(d, 3, 6)));

    }
    public static int[] fac(int[]arr,int start,int end){
        int[]f= new int[end-start+1];
        for(int i=start;i<=end;i++){
            f[i-start]=arr[i];
        }
        return f;
    }
}
