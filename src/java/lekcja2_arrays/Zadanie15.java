package lekcja2_arrays;

import java.util.Arrays;

public class Zadanie15 {
    public static void main(String[] args) {
        int[] ass1 = new int[]{12, 45, 2, 4, 5};
        int[] ass2 = new int[]{23, 54, 53, 12, 23, 48, 46};
        System.out.println(Arrays.toString(wer(ass1, ass2)));
    }

    public static int[] as(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int maxdlug = 0;
        if (arr1.length > arr2.length) {
            maxdlug = 1;
        } else {
            maxdlug = 2;
        }
        int g = 0;
        int y = 1;
        if (maxdlug == 2) {
            for (int i = 0; i < arr1.length; i++) {

                arr3[g] = arr1[i];
                g = g + 2;
            }

            for (int i = 0; i < arr1.length; i++) {

                arr3[y] = arr2[i];
                y = y + 2;

            }
            int d= arr1.length*2;
            for (int i=arr1.length;i <arr2.length;i++){
                arr3[d]=arr2[i];
                d++;
            }
        }
        if (maxdlug == 1) {
            for (int i = 0; i < arr2.length; i++) {

                arr3[g] = arr2[i];
                g = g + 2;
            }

            for (int i = 0; i < arr2.length; i++) {

                arr3[y] = arr1[i];
                y = y + 2;

            }
            int d= arr2.length*2;
            for (int i=arr2.length;i <arr1.length;i++){
                arr3[d]=arr1[i];
                d++;
            }
        }
        return arr3;
    }
    public static int[] wer(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int []krotsza=arr1.length<arr2.length?arr1:arr2;
        int []dluzsa=arr1.length>arr2.length?arr1:arr2;
        int indekskrotszej=krotsza.length;
        int g = 0;
        int y = 1;
        for (int i=0;i<indekskrotszej;i++){
            arr3[g]=krotsza[i];
            g=g+2;
        }
        for (int i=0;i<indekskrotszej;i++){
            arr3[y]=dluzsa[i];
            y=y+2;
        }
        int s=indekskrotszej*2;
        for (int i =indekskrotszej;i<dluzsa.length;i++){
            arr3[s]=dluzsa[i];
            s++;
        }
                return arr3;
    }
}
