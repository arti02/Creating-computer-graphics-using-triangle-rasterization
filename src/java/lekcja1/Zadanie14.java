package lekcja1;

public class Zadanie14 {

    public static void main(String[] args) {
        opa(8,8);
    }


    public static void opa(int a, int b){
        String n=" ";
        for(int i=1;i<=a;i++){
            System.out.print("X");
        }
        System.out.println();
        for(int c = 1;c<=b-2;c++){
            System.out.print("X");
            for(int g=1;g<=a-2;g++){
                System.out.print(" ");
            }
            System.out.println("X");
        }


        for(int d=1;d<=a;d++){
            System.out.print("X");
        }
    }
}
