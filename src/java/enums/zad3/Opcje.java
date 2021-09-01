package enums.zad3;

public enum Opcje {
    POSKA(48), UKRAINA(38), NIEMCY(28);
    private int jakonumer;

    Opcje(int jakonumer) {
        this.jakonumer = jakonumer;
    }

    public String jakoTekst() {
        return "+" + jakonumer;
    }

    public int jakoNumer() {
        return jakonumer;
    }

}
