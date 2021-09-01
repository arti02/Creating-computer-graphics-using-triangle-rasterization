package strings;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println(slovo(("YA tebia opdiszu")));
    }
    public static String slovo(String a){
        String []b=a.split(" ");
        String max="";
        for(String i:b){
            if (max.length()<i.length()){
                max=i;
            }
        }
        return max;
    }



}
