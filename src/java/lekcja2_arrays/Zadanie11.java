package lekcja2_arrays;

public class Zadanie11 {
    public static void main(String[] args) {
        int[]f=new int[]{12,56,87,10};
        System.out.println(easy(f, true));

    }
    public static int easy(int[]arr, boolean a){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        if (a){
            return max;
        }else{
            return min;
        }

    }
}
