package inheritans.zad1;

public class Wykladowca extends Osoba {
    Tytul_naukowy  tytul_naukowy;

    public Wykladowca(String name, int age, Plec plec,Tytul_naukowy tytul_naukowy) {
        super(name, age, plec);
        this.tytul_naukowy=tytul_naukowy;
    }
}
