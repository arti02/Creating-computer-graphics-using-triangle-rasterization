package inheritans.zad2;

public class KontoOszednosciowe extends Konto {

private int  procentOszednośći;
    public KontoOszednosciowe(int stan, int numer, String wlascicel,int procentOszednośći) {
        super(stan, numer, wlascicel);
        this.procentOszednośći=procentOszednośći;
    }

}
