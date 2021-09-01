package lekcja1;

public class Zadanie4 {

    public static void main(String[] args) {
        System.out.println(suda(2,10,5));
        System.out.println(suda(2,10,15));
    }

    public static boolean suda(int start, int koniec, int a){
        if(a>=start&&a<=koniec){
            return true;
        }else{
            return false;
        }
    }
}
