package strings;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println(srednia1("asaprocky"));

    }

    public static String sredina(String slovo) {
        int cyfra = 0;
        String d="";
        String[] massiv = slovo.split("");
        if (massiv.length % 2 != 0) {
            return massiv[massiv.length / 2];
        } else {
            d=massiv[massiv.length / 2 - 1]+massiv[massiv.length / 2 ];
            return d;
        }

    }
    public static String srednia1(String slovo) {
        if (slovo.length() % 2 == 0) {
            return slovo.substring(slovo.length()/2-1,slovo.length()/2+1);
        } else {

            return slovo.substring((slovo.length()-1)/2,(slovo.length()-1)/2+1);
        }

    }
}
