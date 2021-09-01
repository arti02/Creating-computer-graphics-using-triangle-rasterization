package objects.zadanie1;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("Den");
        Person p3=new Person(20);
        Person p4=new Person(20,"Opa");
        System.out.println(p4.getName());
        p1.setAge(24);
        System.out.println(p1.getAge());
        p4.inform();

    }


}
