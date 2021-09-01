package interf.zad1;

public class Dog implements AnimalActions {

    private String breed;
     public static  final int CHVOST=1;

     public static  int lesgs(){
         return 4;

     }

    @Override
    public void eat() {
        System.out.println(breed);
        System.out.println("eat meat");
    }

    @Override
    public void sound() {
        System.out.println("gav gav");
    }

    @Override
    public void move() {
        System.out.println("Run");

    }

    @Override
    public void sleep(int czas) {
        System.out.println("Sleep "+czas+" v den");
    }
}
