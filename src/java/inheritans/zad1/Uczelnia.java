package inheritans.zad1;

import java.util.ArrayList;
import java.util.List;

public class Uczelnia {
   private String nazwa;
   private String adres;
   List<Student>list=new ArrayList<>();
   List<Wykladowca>wykladowcaList=new ArrayList<>();

    public Uczelnia(String nazwa, String adres, List<Student> list, List<Wykladowca> wykladowcaList) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.list = list;
        this.wykladowcaList = wykladowcaList;
    }
}
