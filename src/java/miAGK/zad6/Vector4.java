package miAGK.zad6;

public class Vector4 {
     private float x;
    private float y;
    private float z;

    @Override
    public String toString() {
        return "Vector4{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                '}';
    }

    private float d;

    public Vector4(float x, float y, float z, float d) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.d = d;
    }
    public float scalM4(Vector4 vector) {
        return  this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ()+this.getD() * vector.getD();
    }
    public Vector4 multByK(float k) {
        this.x = this.getX() * k;
        this.y = this.getY() * k;
        this.z = this.getZ() * k;
        this.d=this.getD()*k;

        return this;
    }
    public Vector4(Vector3 vector3, float d){
        this.x=vector3.getX();
        this.y=vector3.getY();
        this.z=vector3.getZ();
        this.d=d;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }



}
