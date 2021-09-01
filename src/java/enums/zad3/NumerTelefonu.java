package enums.zad3;

public class NumerTelefonu {
     private int numer;
     private Opcje kierunkowy;

    public NumerTelefonu(int numer, Opcje kierunkowy){
        this.numer=numer;
        this.kierunkowy=kierunkowy;
    }

    public int getNumer() {
        return numer;
    }

    public Opcje getKierunkowy() {
        return kierunkowy;
    }

    public void krasivo(){

        System.out.println("("+ kierunkowy.jakoTekst()+")"+numer);
    }

}
