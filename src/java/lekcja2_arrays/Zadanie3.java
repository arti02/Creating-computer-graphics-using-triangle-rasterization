package lekcja2_arrays;

public class Zadanie3 {
    public static void main(String[] args) {
    int[]c=new int[]{-1,-100,23,45};
        hopa(c);

    }
    public static void hopa(int[] arr){
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
            if (arr[i]<b){
                b=arr[i];
            }
        }
        System.out.println("max "+a+"  min "+b);
    }
}
