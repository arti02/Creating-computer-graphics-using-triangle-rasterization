package inheritans.zad1;

public class Osoba {
    private String name;
    private int age;
    Plec plec;
    public Osoba(String name,int age,Plec plec){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
