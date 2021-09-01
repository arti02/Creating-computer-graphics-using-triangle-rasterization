package inheritans.zad3;

public class Pociag extends Pojazd {
    private int liczbaWagonow;
    private boolean czyMaWagonBarowy;
    public Pociag(String nazwa, int maxPred, int licbaPasagerow,int liczbaWagonow,boolean czyMaWagonBarowy) {
        super(nazwa, maxPred, licbaPasagerow);
        this.liczbaWagonow=liczbaWagonow;
        this.czyMaWagonBarowy=czyMaWagonBarowy;
    }
}
