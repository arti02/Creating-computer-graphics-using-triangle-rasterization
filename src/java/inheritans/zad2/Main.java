package inheritans.zad2;

public class Main {
    public static void main(String[] args) {
       KontoFirmowe a=new KontoFirmowe(18,1412,"op",1);
       KontoOszednosciowe b=new KontoOszednosciowe(12,15151,"sery",12);
       a.przelewNa(b,12);
        System.out.println(b.sprstanu());
    }
}
