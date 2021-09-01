package strings;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println(kankulator("12+4+12", "add"));
    }

    public static int kankulator(String operacja, String rodzaj) {
        int cyfra = 0;
        int cyfra1=1;
        switch (rodzaj) {
            case "add":
                String[] b = operacja.split("\\+");
                for (int i = 0; i < b.length; i++) {
                    cyfra = cyfra + Integer.parseInt(b[i]);
                }
                return cyfra;
            case "substr":
                String[] c = operacja.split("-");
                    cyfra = Integer.parseInt(c[0])-Integer.parseInt(c[1]);

                return cyfra;
            case "mult":
                String[] d = operacja.split("\\*");
                for (int i = 0; i < d.length; i++) {
                    cyfra1 = cyfra1 * Integer.parseInt(d[i]);
                }
                return cyfra1;
            case "div":
                String[] g = operacja.split("/");

                    cyfra1 = Integer.parseInt(g[0])/Integer.parseInt(g[1]);
                return cyfra1;
            default:
               return  0;
        }

    }
}
