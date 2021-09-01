package inheritans.zad2;

public class Konto {
    private int stan;
    private int numer;
    private String wlascicel;

    public Konto(int stan, int numer, String wlascicel) {
        this.stan = stan;
        this.numer = numer;
        this.wlascicel = wlascicel;
    }

    public void wplata(int pineniedze) {
        stan = stan + pineniedze;
    }

    public void wyplata(int pieniadze) {
        if (pieniadze > stan) {
            System.out.println("tak ne pojdet");
        } else {

            stan = stan - pieniadze;
        }
    }

    public int sprstanu() {
        return stan;
    }

    public void przelewNa(Konto a, int sum) {
        if (sum > stan) {
            System.out.println("tak ne pojdet");
        } else {
            a.stan = a.stan + sum;
            this.stan = this.stan - sum;
        }

    }

}
