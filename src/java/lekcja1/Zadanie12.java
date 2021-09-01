package lekcja1;

public class Zadanie12 {

    public static void main(String[] args) {
        predel(0,15);

    }

    public static void predel(int a, int b){
        for(int i= a; i<=b;i++){
         if(i%5==0&&i%3==0){
             System.out.println(i +" <- "+ "5,3");
         }else if(i%5==0){
             System.out.println(i+ " <- "+ "5");
         }
         else if (i%3==0){
             System.out.println(i+" <- "+ "3");
         }
         else{
                System.out.println(i);
            }
        }
    }
}
