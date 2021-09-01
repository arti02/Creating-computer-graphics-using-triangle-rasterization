package lekcja2_arrays;

import java.util.Random;

public class Zadanie20 {

    public static void main(String[] args) {
        int [][]tapok={{2,2,2,2},{4,4,4,4}};
        printArray(gk(tapok));

    }
    public static int[][] gk(int [][]arr){
        int a =0;
        int b=0;
      int nowy[][]=new int[arr[0].length][arr.length];

        for (int i=0;i<arr[0].length;i++){
            b=0;
            for (int j= arr.length-1;j>=0;j--){
                nowy[a][b]=arr[j][i];
                b++;
            }
            a++;
        }
        return nowy;
    }
    public static void printArray(int [][]arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
