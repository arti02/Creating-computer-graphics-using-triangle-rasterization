package lekcja2_arrays;

import java.util.Arrays;
import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kom(6)));
    }

    public static int[] fillarray(int length) {
        int []arr=new int[length];

        Random cyfra=new Random();
        for (int i =0;i<length;i++){
           arr[i]= cyfra.nextInt();
        }
        return arr;
    }
    public static int[] kom(int leg){
        int []arr = new int[leg];
        for (int i=0;i<leg;i++){
            arr[i]=10+i;
        }
        return arr;
    }



}
