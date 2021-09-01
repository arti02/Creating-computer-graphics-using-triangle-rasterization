package lekcja2_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        asp();
    }

    public static void asp() {
        Scanner size = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int a = size.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter the element with index " + i + " : ");
            int b = size.nextInt();
            arr[i] = b;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a =a+ arr[i];

        }
        return a;
    }
}
