package collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println(priem());
    }

    public static List<Integer> priem() {
        Scanner s = new Scanner(System.in);
        List<Integer> nowy = new ArrayList<>();
        while (true) {
            System.out.println("Ведите число суки");
            int i = s.nextInt();
            if (i != -1) {
                nowy.add(i);
            }else{
                break;
            }
        }
        return nowy;
    }

}
