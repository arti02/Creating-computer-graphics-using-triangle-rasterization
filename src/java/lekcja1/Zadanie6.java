package lekcja1;

public class Zadanie6 {


    public static void main(String[] args) {
        System.out.println(popoczka(3));
    }

    public static String popoczka(int a){
        switch (a){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            default:
                return "pizdets";
        }
    }

}
