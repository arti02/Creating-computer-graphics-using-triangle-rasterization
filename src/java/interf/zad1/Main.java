package interf.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        AnimalActions a=new Parrot();
        AnimalActions b=new Dog();
        list.add(a);
        list.add(b);
        a.eat();
        b.move();
        a.sleep(2);
        b.sound();
        a.sound();
        Parrot p=new Parrot();
        p.drink();
        System.out.println(AnimalActions.eyes);
        System.out.println(Dog.CHVOST);
        System.out.println(Dog.lesgs());
    }

}
