package miAGK.zad6;

import java.awt.*;

public class Triangle {
    Vector3 n1,n2,n3;
    public Triangle(Vector3 a, Vector3 b, Vector3 c, Color color1, Color color2, Color color3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;

    }
    Triangle(Vector3 x, Vector3 y, Vector3 z, Vector3 n1, Vector3 n2, Vector3 n3)
    {
        this.setA(x);
        this.setB(y);
        this.setC(z);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Triangle(Vector3 a, Vector3 b, Vector3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Vector3 a,b,c;
    Color color1;
    Color color2;
    Color color3;

    public Triangle() {

    }




    public Vector3 getA() {
        return a;
    }

    public Vector3 getB() {
        return b;
    }

    public Vector3 getC() {
        return c;
    }

    public void setA(Vector3 a) {
        this.a = a;
    }

    public void setB(Vector3 b) {
        this.b = b;
    }

    public void setC(Vector3 c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color1=" + color1 +
                ", color2=" + color2 +
                ", color3=" + color3 +
                '}';
    }
}
