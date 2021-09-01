package lekcja1;

public class Zadanie9 {

    public static void main(String[] args) {
       // pider(12);
       // mup();
       // multiply(5);
        //jump(0,5,5);

        System.out.println(suma(45));
    }

    public static void pider(int a){

        for (int i =0;i<=a;i++){
            System.out.println(i);
        }
    }

    public static void mup(){
        for(int i=10;i<=20;i=i+2){

            System.out.println(i);
        }

    }
    public static void multiply(int a){
        for(int i=1;i<=a;i++){

            System.out.println(i*10);
        }

    }


    public static void jump(int a,int b, int c){

        for(int i=a;i<b;i++){
            System.out.println(i*c);
        }
    }
    public static int suma(int a){
        int b= 0;
        for(int i=1;i<=a;i++){
            b=b+i;
        }
        return b;
    }
}
