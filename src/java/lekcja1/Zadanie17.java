package lekcja1;

public class Zadanie17 {

    public static void main(String[] args) {
        pridurok(1,10);

    }
    public static void pridurok(int a,int b){
        for(int i=a;i<=b;i++){
            System.out.print(i+"->");
            for (int c=1;c<=b;c++){
                if (i%c==0){
                    System.out.print(" "+c+" ");
                }
            }
            System.out.println();
        }
    }
}
