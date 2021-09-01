package enums.zad4;

public class Test {
    public static void main(String[] args) {
        Osoba chel2=new Osoba(Plec.KOBIETA);
        Plec q=chel2.getPlec();
        Osoba chel1=new Osoba(Plec.KOBIETA);
        Plec d=chel1.getPlec();
        boolean odp=d.equals(q);
        System.out.println(odp);
    }

}
