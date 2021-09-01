package enums.zad2;

public enum TypWaluty {
    USD("dolar"),EUR("euro"),PLN("zloty");
    private String opis;
   TypWaluty(String opis){
       this.opis=opis;
   }

    public String getOpis() {
        return opis;
    }
}
