package lekcja2_arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;
import java.util.Random;

public class Zadanie19 {
    public static void main(String[] args) {
        int [][] n = massiv(2,4);
        a(n);

    }
    public static int[][] massiv(int dlug,int szerok){
        int[][]bom=new int[dlug][szerok];
        Random random=new Random();
        for (int i=0;i<dlug;i++){
            for(int j=0;j<szerok;j++){
                bom[i][j]=random.nextInt(100)-50;
            }
        }
        return bom;
    }
    public static void a(int [][]arr){
        for(int i =0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
