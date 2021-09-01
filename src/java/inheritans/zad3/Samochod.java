package inheritans.zad3;

public class Samochod extends Pojazd {
    private int licbaKol;
    private int liczbaDrzwi;

    public Samochod(String nazwa, int maxPred, int licbaPasagerow,int licbaKol,int liczbaDrzwi) {
        super(nazwa, maxPred, licbaPasagerow);
        this.licbaKol=licbaKol;
        this.liczbaDrzwi=liczbaDrzwi;

    }
}
