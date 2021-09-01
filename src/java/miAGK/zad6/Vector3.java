package miAGK.zad6;

public class Vector3 {


    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Vector3(Vector3 vector3){
        this.x=vector3.getX();
        this.y=vector3.getY();
        this.z=vector3.getZ();
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public void negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }
    public float scalProd( Vector3 f3)
    {
        return this.x*f3.getX()+ this.y* getY() + this.z* getZ();
    }
    public Vector3 vecSub(Vector3 vector1) {
        //good
        float x = this.getX() -vector1.getX();
        float y = this.getY() - vector1.getY();
        float z = this.getZ() - vector1.getZ() ;
        Vector3 xd =new Vector3(x, y, z);
        return  xd;
    }

    public float lenVector(){
    return (float) Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
    }
    public Vector3 normalize(){
        float epsilon=0.00001f;
        float len=this.lenVector();
        if (len>epsilon){
            this.x/=len;
            this.y/=len;
            this.z/=len; }
        else{

            x=y=z=0;
        }
        return this;
    }
    public Vector3 scalSub(Vector3 v2) {
        return new Vector3(this.getX() - v2.getX(),this.getY() - v2.getY(),this.getZ() - v2.getZ());
    }
    public Vector3 vecCross(Vector3 vector) {
        float ax = this.getX();
        float ay = this.getY();
        float az = this.getZ();
        float bx = vector.getX();
        float by = vector.getY();
        float bz = vector.getZ();
        float cx = ay * bz - az * by;
        float cy = az * bx - ax * bz;
        float cz = ax * by - ay * bx;

        return new Vector3(cx, cy, cz);
    }

    public float scalM(Vector3 vector) {
        return  this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ();
    }

    public Vector3 multByK(float k) {
        this.x = this.getX() * k;
        this.y = this.getY() * k;
        this.z = this.getZ() * k;

        return this;
    }
    public Vector3 addVector(Vector3 vc)
    {
        return new Vector3(this.getX()+ vc.getX(), this.getY()+vc.getY(), this.getZ()+ vc.getZ());
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }


   private float x, y, z;


}
