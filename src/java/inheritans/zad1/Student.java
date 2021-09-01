package inheritans.zad1;

import java.util.HashMap;
import java.util.Map;

public class Student extends Osoba {
     private Uczelnia uczelnia;
     private int rokStudiow;
     Map<PrzedmiotUczelniany,Integer>map=new HashMap<>();
    public Student(String name, int age, Plec plec,Uczelnia uczelnia,int rokStudiow,Map<PrzedmiotUczelniany,Integer> map) {
        super(name, age, plec);
        this.map=map;
        this.rokStudiow=rokStudiow;
        this.uczelnia=uczelnia;

    }
}
