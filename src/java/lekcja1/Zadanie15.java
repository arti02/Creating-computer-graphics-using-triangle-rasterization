package lekcja1;

public class Zadanie15 {
    public static void main(String[] args) {
        damb(2, 3, 12);

    }

    public static void damb(int a, int b, int c) {
        if (a > b) {
            System.out.println("a nie to");
        } else if (c > b) {
            System.out.println("c nie to");
        } else {
            for (int i = a; i <= b; i = i + c) {
                System.out.println(i);
                ;
            }
        }
    }

    public static void damb2(int a, int b, int c) {
        if (a > b) {
            System.out.println("a nie to");
            return;
        }
        if (c > b) {
            System.out.println("c nie to");
            return;
        }
        for (int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
    }
}

