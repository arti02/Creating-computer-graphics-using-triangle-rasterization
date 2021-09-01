package inheritans.zad2;

public class KontoFirmowe extends Konto {
    private int oplataZaTranzakcje;
    public KontoFirmowe(int stan, int numer, String wlascicel,int oplataZaTranzakcje) {
        super(stan, numer, wlascicel);
        this.oplataZaTranzakcje=oplataZaTranzakcje;
    }
}
