package enums.zad2;

public class Main {
    public static void main(String[] args) {
        Waluta d1=new Waluta(4,3, TypWaluty.USD);
        System.out.println(d1.getTypWaluty().getOpis());
        d1.converter(10);
    }
}
