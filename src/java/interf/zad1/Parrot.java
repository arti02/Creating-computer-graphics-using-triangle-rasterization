package interf.zad1;

public class Parrot implements AnimalActions {
    @Override
    public void eat() {
        System.out.println("semena");
    }

    @Override
    public void sound() {
        System.out.println("chik chirik");
    }

    @Override
    public void move() {
        System.out.println("fly");
    }

    @Override
    public void sleep(int czas) {
        System.out.println("spid "+czas+" v den");
    }

    public void sru(int raz){
        System.out.println("sru ocz mnogo "+raz+" v sekundu");
    }
}
