package enums.zad4;

public class Main {
    public static void main(String[] args) {
        Osoba os1=new Osoba(Plec.MENCZYZNA);
        Osoba os2=new Osoba(Plec.KOBIETA);
        Osoba os3=new Osoba(Plec.KOBIETA);
        Osoba []arr=new Osoba[]{os1,os2,os3};
        System.out.println(liczba(Plec.KOBIETA, arr));
    }
    public static int liczba(Plec x,Osoba[]arr){
        int liczbakob=0;
        for (Osoba i:arr){
            if (i.getPlec().equals(x)){
                liczbakob++;
            }

        }
        return liczbakob;
    }

}
