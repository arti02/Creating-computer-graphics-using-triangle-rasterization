package lekcja2_arrays;

public class Zadanie2 {

    public static void main(String[] args) {
    int c[]=new int[]{2,5,7,9,3};
        System.out.println(sum(c));

    }

    public static double sum(int[] arr) {
        int a=0;
        for (int i=0;i<arr.length;i++){
            a=a+arr[i];

        }
        return a/arr.length;

    }
}
