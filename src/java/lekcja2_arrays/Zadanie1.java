package lekcja2_arrays;

public class Zadanie1 {

    public static void main(String[] args) {
        int[] a = new int[]{2,6,9,4,6,8,3,2,5};
        int[] b = new int[]{2,6,9};
        int[] c = new int[]{6,8,3,2,5};

        arg(a);
        arg(b);
        arg(c);
    }

    public static void arg( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
