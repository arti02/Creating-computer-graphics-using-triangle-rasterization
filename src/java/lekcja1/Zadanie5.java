package lekcja1;

public class Zadanie5 {

    public static void main(String[] args) {
        System.out.println(sik(true));
        System.out.println(sik(false));
    }

   public static String sik(boolean b){
        return b ? "da": "nie";

//        if(b){
//            return "da";
//        }else{
//            return "nie";
//        }


   }
}
