package strings;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println(gop("Add kalmen"));
    }
    public static boolean ded(String b){
       String a= b.toLowerCase();
       return a.contains("a")||a.contains("e")||a.contains("y")||a.contains("o")||a.contains("u")||a.contains("i");


    }
    public static int gop(String a){
        int kolvo=0;
        String  c= a.toLowerCase();
        String []b=c.split("");
        for (String i:b){
            if (i.equals("a")||i.equals("e")||i.equals("o")){
                kolvo++;
            }
        }
        return kolvo;
    }
}
