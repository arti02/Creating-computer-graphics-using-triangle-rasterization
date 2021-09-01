package tomtom;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static  int sum(){
        int x=0;
//        for (int i=3;i<20;i=i+3){
//            x+=i;
//            System.out.println(i);
//        }
        for (int j=5;j<20;j=j+5){
            if (j%5==0&&j%3==0){
                continue;
            }
            x+=j;
            System.out.println(j);
        }

        return x;
    }
}

