package enums.zad3;

public class Main {
    public static void main(String[] args) {
        NumerTelefonu n1=new NumerTelefonu(1234551,Opcje.NIEMCY);
        System.out.println(n1.getKierunkowy().jakoNumer());
    }
}
