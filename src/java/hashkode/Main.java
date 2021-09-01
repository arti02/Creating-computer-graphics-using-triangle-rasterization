package hashkode;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person(12,"Tema");
        Person p2 =new Person(12, "Tema");
        Person p3 =p2;

        System.out.println(p1.equals(p2));
        //System.out.println(p2 == p3);
    }

}
