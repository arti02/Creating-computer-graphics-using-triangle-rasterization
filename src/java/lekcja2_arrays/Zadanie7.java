package lekcja2_arrays;

public class Zadanie7 {
    public static void main(String[] args) {
    int[]sa=new int[]{156,12,54,100,2000};
        System.out.println(f5(sa));
    }

    public static int f5(int[] arr) {
        int max = Integer.MIN_VALUE;
        int beforemax=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                beforemax=max;
                max=arr[i];
            }
            if(arr[i]>beforemax&&arr[i]<max){
                beforemax=arr[i];
            }
        }
            return beforemax;
    }
}
