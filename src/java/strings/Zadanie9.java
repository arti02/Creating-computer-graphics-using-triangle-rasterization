package strings;

public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println(oborot("russkie nie zdautsa"));
    }

    public static String oborot(String predlozenie) {
        String[] b = predlozenie.split(" ");
        String koniec = "";
        for (int i = 0; i < b.length; i++) {
            koniec = koniec+" " + obslovo(b[i]);

        }
        return koniec;
    }


    public static String obslovo(String slovo) {
        String nowslovo = "";

        for (int i = 0; i < slovo.length(); i++) {
            nowslovo = slovo.charAt(i) + nowslovo;
        }
        return nowslovo;
    }

}
