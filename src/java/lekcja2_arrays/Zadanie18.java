package lekcja2_arrays;

public class Zadanie18 {
    public static void main(String[] args) {
     int[]zalupa=new int[]{21,1,6,7,8};
        System.out.println(huj(zalupa, 34));
    }
    public static int huj(int[]arr,int b) {
        int liczba = 0;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum < b) {
                sum = sum + arr[i];
                liczba++;
            }
        }
        return liczba;
    }
}
