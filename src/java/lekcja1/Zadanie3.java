package lekcja1;

public class Zadanie3 {

    public static void main(String[] args){

        System.out.println(popa(6,8));
        System.out.println(popa(6,9));
        System.out.println(popa(3,9));
    }
    public static boolean proverka(int a,int b){

        if (a%2==0&&b%2==0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean popa(int a,int b){
        if (a%2==0||b%2==0){
            return true;

        }else{
            return false;
        }
    }


}
