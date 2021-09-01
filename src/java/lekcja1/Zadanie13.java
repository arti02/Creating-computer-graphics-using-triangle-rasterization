package lekcja1;

public class Zadanie13 {

    public static void main(String[] args) {
jaja(5);
    }

    public static void slozno(int a){
        for (int b=1;b<=a;b++) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i*b + "\t");

            }
            System.out.println();
        }
    }
    public static void jaja(int a){
        int c=1;
        for (int i=1;i<=a;i++){
            for(int b=1;b<=i;b++){
                System.out.print( c++ +"\t");

            }
            System.out.println();
        }
    }




}
