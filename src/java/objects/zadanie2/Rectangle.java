package objects.zadanie2;

import java.util.Objects;

public class Rectangle {
     private int dlugosc;
    private int szerokosc;

    public Rectangle(int dl,int sz){
        dlugosc=dl;
        szerokosc=sz;
    }
    public int perimetr(){
        int p=(this.dlugosc+this.szerokosc)*2;
        return p;
    }
    public int ploszad(){
        int s=this.dlugosc*this.szerokosc;
        return s;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    @Override
    public String toString() {
        return "Rectangle" +
                "dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return dlugosc == rectangle.dlugosc &&
                szerokosc == rectangle.szerokosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlugosc, szerokosc);
    }
}
