package enums.zad2;

public class Waluta {
    private int kursSprzedazy;
    private int kursKupna;
    TypWaluty typWaluty;
    public Waluta(int kursSprzedazy,int kursKupna,TypWaluty typWaluty){
        this.typWaluty=typWaluty;
        this.kursKupna=kursKupna;
        this.kursSprzedazy=kursSprzedazy;
    }

    public int getKursKupna() {
        return kursKupna;
    }

    public int getKursSprzedazy() {
        return kursSprzedazy;
    }

    public TypWaluty getTypWaluty() {
        return typWaluty;
    }

    @Override
    public String toString() {
        return "Waluta{" +
                "kursSprzedazy=" + kursSprzedazy +
                ", kursKupna=" + kursKupna +
                ", typWaluty=" + typWaluty +
                '}';
    }
    public void converter(double x){
        double sum=x/kursSprzedazy;
        System.out.printf("Za %.2f zl kupisz %.2f %s", x, sum, typWaluty);
    }

}
