package enums.zad1;

public class Main {
    public static void main(String[] args) {
        Chair ch1=new Chair(10,Colors.BLACK,Material.DEREVO);
        Chair ch2=new Chair(21,Colors.GREEN,Material.STAL);
        System.out.println(ch2.getColor());
        System.out.println(ch1);
        System.out.println(ch2);
    }

}
