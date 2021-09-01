package objects.zadanie3;

public class Rownanie {
    private int a;
    private int b;
    private int c;

    public Rownanie(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Rownanie(){}
    public int odpowiedz(){
        int x= (int) (Math.pow(a,2)+Math.pow(b,3)+Math.pow(c,4));
     return x;
    }
    public boolean przek(int d){
        if (odpowiedz()>d){
            return true;
        }
        return false;
    }

}
