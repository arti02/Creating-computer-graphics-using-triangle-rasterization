package strings;

public class Zadanie11 {
    public static void main(String[] args) {
        String[] b = new String[]{"ja", "poshol","gulat"};
        System.out.println(sent(b));
    }

    public static String sent(String[] arr) {
        String napis = "";
        for (int i = 0; i < arr.length; i++) {
            napis = napis+" "  + arr[i];
        }


        String s = String.valueOf(napis.charAt(1));
        return napis.replaceFirst(s, s.toUpperCase());


    }
}
