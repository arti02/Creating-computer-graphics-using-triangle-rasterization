package strings;

import java.util.Arrays;

public class Zadanie7 {
    public static void main(String[] args) {
        System.out.println(data("10,12,2020", ","));
    }
    public static String data(String vremia,String przecinek){
        String[]b=vremia.split(przecinek);
        System.out.println(Arrays.toString(b));
        return b[b.length-1];
    }
}
