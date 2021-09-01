package lekcja1;

public class Zadanie11 {
    public static void main(String[] args) {
        slozno(3,120);
    }
    public static void slozno(int a,int b){
        for(int i=0;;i++){
            if(Math.pow(a,i)>=b){
                break;
            }else{
                System.out.println(a+"^"+i+"="+Math.pow(a,i));
            }
        }

    }
}
