package strings;

public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println(minuty("12:55"));
    }

    public static int minuty(String vremia) {
        String[] d = vremia.split(":");
        int g = Integer.parseInt(d[0]);
        int c = Integer.parseInt(d[1]);
        return g*60 + c;
    }
}
