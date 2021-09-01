package lekcja1;

public class Zadanie16 {
    public static void main(String[] args) {
     ops(2,4);
    }
    public static void ops(int a, int b){
        for(int i=1;i<=b;i++){
            for(int c=1;c<=i;c++){
                System.out.print(a);
            }
            System.out.print(" ");

        }
    }
}
