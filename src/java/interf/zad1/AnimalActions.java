package interf.zad1;

public interface AnimalActions {
    String eyes="2";
    void eat();
    void sound();
    void move();
    void sleep(int czas);
    default void drink(){
        System.out.println("vodka");
    }
}
