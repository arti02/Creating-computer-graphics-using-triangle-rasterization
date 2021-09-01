package strings;

public class Zadanie1 {
    public static void main(String[] args) {
        String d="532";
        System.out.println(da(d));
    }

    public static String da(String a) {
        int sum = 0;
        String[] b = a.split("");
        for (String i : b) {
            sum = sum + Integer.parseInt(i);
        }
        return String.valueOf(sum);
    }
}
