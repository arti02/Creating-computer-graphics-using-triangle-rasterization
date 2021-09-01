package enums.zad1;

public class Chair {
    int cena;
    Colors color;
    Material material;
    public Chair(int cena,Colors color,Material material){
        this.cena=cena;
        this.color=color;
        this.material=material;
    }
    public int getCena(){
        return cena;
    }
    public Colors getColor(){
        return color;
    }
    public Material getMaterial(){
        return material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "cena=" + cena +
                ", color=" + color +
                ", material=" + material +
                '}';
    }
}
