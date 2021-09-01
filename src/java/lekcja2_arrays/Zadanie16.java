package lekcja2_arrays;

public class Zadanie16 {
    public static void main(String[] args) {
        System.out.println(ds(1, 2, 5, 7, 6, 3));
    }

    public static int ds(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;

        }
        return sum;
    }

}
