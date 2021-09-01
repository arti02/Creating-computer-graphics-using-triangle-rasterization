package miAGK.zad6;

public class VertexProcssor {

//    Matrix4x4 obj2world = new Matrix4x4();;
//    static Matrix4x4 view2proj = new Matrix4x4();
//    static Matrix4x4 world2view = new Matrix4x4();
//     private boolean traslation=false;
//    private boolean scale=false;
//     private   boolean roation=false;
//
//
//    public  static void setPerspective(float fovy, float aspect, float near, float far) {
//        fovy *= Math.PI / 360; // FOVy/2
//        float f = (float) (Math.cos(fovy) / Math.sin(fovy));
//        view2proj.a = new Vector4(f / aspect, 0, 0, 0);
//        view2proj.b = new Vector4(0, f, 0, 0);
//        view2proj.c = new Vector4(0, 0, (far + near) / (near * far), -1);
//        view2proj.d = new Vector4(0, 0, 2 * far * near / (near * far), 0);
//
//    }
//
//    public static void setLookat(Vector3 eye, Vector3 center, Vector3 up) {
//        Vector3 f = center.scalSub(eye);
//        f = f.normalize();
//        up = up.normalize();
//        Vector3 s = up.vecCross(f);
//        s.normalize();
//        Vector3 u = f.vecCross(s);
//        u.normalize();
////
//        world2view.a = new Vector4(s.getX(), u.getX(), -f.getX() ,0);
//        world2view.b = new Vector4(s.getY(), u.getY(), -f.getY(), 0);
//        world2view.c = new Vector4(s.getZ(), u.getZ(), -f.getZ(), 0);
//        world2view.d = new Vector4(-eye.scalM(s), -eye.scalM(u), -eye.scalM(f), 1);
//
////        world2view.a = new Vector4(s.getX(), s.getY(), s.getZ(), -eye.scalM(s));
////        world2view.b = new Vector4(u.getX(), u.getY(), u.getZ(), -eye.scalM(u));
////        world2view.c = new Vector4(f.getX(), f.getY(), f.getZ(), -eye.scalM(f));
////        world2view.d = new Vector4(0, 0, 0, 1);
//////////
////            world2view.a = new Vector4(s.getX(), u.getX(), -1*f.getX(), 0);
////            world2view.b = new Vector4(s.getY(), u.getY(), -1*f.getY(), 0);
////            world2view.c = new Vector4(s.getZ(), u.getZ(), -1*f.getZ(), 0);
////            world2view.d = new Vector4(0, 0, 0, 1);
////        Matrix4x4 m=new Matrix4x4(); // i d e n t i t y
////        Vector3 eyeNEG= new Vector3(eye);
////        eyeNEG.negate();
////        m.d =new Vector4(-eye.getX(),-eye.getY(),-eye.getZ(),1);
////        world2view.multiply(m);
//    }
//
//    //Transalcja
//    public void translation(Vector3 v) {
//
//        Matrix4x4 m = new Matrix4x4(
//                new Vector4(1, 0, 0, v.getX()),
//                new Vector4(0, 1, 0, v.getY()),
//                new Vector4(0, 0, 1, v.getZ()),
//                new Vector4(0, 0, 0, 1));
//        obj2world = m.multiply(obj2world);
//
//        traslation=true;
//    }
//
//    //Skalowanie
//    public void multByScale(Vector3 v) {
//        Matrix4x4 m = new Matrix4x4(
//                new Vector4(v.getX(), 0, 0, 0),
//                new Vector4(0, v.getY(), 0, 0),
//                new Vector4(0, 0, v.getZ(), 0),
//                new Vector4(0, 0, 0, 1));
//        obj2world = m.multiply(obj2world);
//        scale=true;
//
//    }
//
//    //Rotacja
//    public void multByRotation(float a, Vector3 v) {
//        float s = (float) Math.sin(a * Math.PI / 180);
//        float c = (float) Math.cos(a * Math.PI / 180);
//        v.normalize();
//        Matrix4x4 m = new Matrix4x4(
//                new Vector4(v.getX() * v.getX() * (1 - c) + c, v.getY() * v.getX() * (1 - c) + v.getZ() * s,
//                        v.getX() * v.getZ() * (1 - c) - v.getY() * s, 0),
//                new Vector4(v.getX() * v.getY() * (1 - c) - v.getZ() * s, v.getY() * v.getY() * (1 - c) + c,
//                        v.getY() * v.getZ() * (1 - c) + v.getX() * s, 0),
//                new Vector4(v.getX() * v.getZ() * (1 - c) + v.getY() * s, v.getY() * v.getZ() * (1 - c) - v.getX() * s,
//                        v.getZ() * v.getZ() * (1 - c) + c, 0),
//                new Vector4(0, 0, 0, 1));
//        obj2world = m.multiply(obj2world);
//        roation=true;
//
//    }
//
//    public Triangle TRVEc(Triangle v) {
//        System.out.println("*************");
//        System.out.println(view2proj);
//        System.out.println(world2view);
//        System.out.println("*************");
//        Matrix4x4 multiply;
//        if (traslation){
//            Matrix4x4 x=world2view.multiply(obj2world);
//            multiply=view2proj.multiply(x);
//        }else if(scale){
//            Matrix4x4 x=world2view.multiply(obj2world);
//            multiply=view2proj.multiply(x);
//
//        }else if(roation){
//            Matrix4x4 x=world2view.multiply(obj2world);
//            multiply=view2proj.multiply(x);
//
//        }
//        else {
//            multiply = view2proj.multiply(world2view);
//        }
//        Triangle newTR = new Triangle();
//        newTR.color1=v.color1;
//        newTR.color2=v.color2;
//        newTR.color3=v.color3;
//        Vector4 v1 = new Vector4(v.getA().getX(), v.getA().getY(), v.getA().getZ(), 1);
//        Vector4 v2 = new Vector4(v.getB().getX(), v.getB().getY(), v.getB().getZ(), 1);
//        Vector4 v3 = new Vector4(v.getC().getX(), v.getC().getY(), v.getC().getZ(), 1);
//        Vector4 vK;
//        vK = multiply.MatrixByVectro(v1);
//        newTR.setA(new Vector3(vK.getX() / vK.getD(), vK.getY() / vK.getD(), vK.getZ() / vK.getD()));
//        System.out.println(vK+"VK--------1");
//        vK = multiply.MatrixByVectro(v2);
//        newTR.setB(new Vector3(vK.getX() / vK.getD(), vK.getY() / vK.getD(), vK.getZ() / vK.getD()));
//        System.out.println(vK+"VK--------2");
//        vK = multiply.MatrixByVectro(v3);
//        newTR.setC(new Vector3(vK.getX() / vK.getD(), vK.getY() / vK.getD(), vK.getZ() / vK.getD()));
//        return  newTR;
//    }
//    public Vector3 tR(Vector3 v) {
//        Vector4 v1 = new Vector4(v.getX(), v.getY(), v.getZ(), 1);
//        Matrix4x4 matrix = view2proj.multiply(world2view);
//        Matrix4x4 matrix2=obj2world.multiply(matrix);
//        Vector4 v2 = matrix2.MatrixByVectro(v1);
//        return new Vector3(v2.getX()/v2.getD() , v2.getY() /v2.getD(), v2.getZ()/v2.getD());
//
//    }
    public static Matrix4x4 view2proj = Matrix4x4.setIdentity();
    public static Matrix4x4 world2view= Matrix4x4.setIdentity();
    public Matrix4x4 obj2world= Matrix4x4.setIdentity();
    public static void setPerspective(float fovy, float aspect,float near, float far)
    {       //Green
        fovy *= Math.PI/ 360;
        float f = (float)(Math.cos(fovy)/Math.sin(fovy));
        view2proj.setX1(new Vector4((f/aspect),0,0,0));
        view2proj.setX2(new Vector4(0,f,0,0));
        view2proj.setX3(new Vector4(0,0,(far+near)/(near-far), -1));
        view2proj.setX4(new Vector4(0,0,2*far*near/(near-far), 0));
        System.out.println(view2proj.toString());
    }
    public static void setLookat(Vector3 eye, Vector3 center, Vector3 up)
    {
        //cross and normalize work
        Vector3 f = center.vecSub(eye);
        f = f.normalize();
        up = up.normalize();
        Vector3 s = up.vecCross(f);
        Vector3 u = f.vecCross(s);
        world2view.setX1(new Vector4(s.getX(),u.getX(),(-1)*f.getX(),0));
        world2view.setX2(new Vector4(s.getY(),u.getY(),(-1)*f.getY(),0));
        world2view.setX3(new Vector4(s.getZ(),u.getZ(),(-1)*f.getZ(),0));
        world2view.setX4(new Vector4(0,0,0,1));
        //   this.world2view.setX4(new float4(-eye.getX(),-eye.getY(),-eye.getZ(),1));
        Matrix4x4 m = Matrix4x4.setIdentity();
        m.setX4(new Vector4(-eye.getX(),-eye.getY(),-eye.getZ(),1));
        System.out.println(world2view);
        world2view = m.multiplication(world2view);
        System.out.println("loook");
        System.out.println(world2view);
    }
    public Vector3 tR(Vector3 v) {
        Matrix4x4 xd =  world2view.multiplication(this.obj2world);
        Matrix4x4 xd2 =view2proj.multiplication(xd);

        Vector4 xd3 =  xd2.multiplication(new Vector4(v.getX(),v.getY(),v.getZ(),1));
        return new Vector3(xd3.getX(),xd3.getY(),xd3.getZ());
    }
    public void multiByTranslation(Vector3 v)
    {
        Matrix4x4 matrix = new Matrix4x4(new Vector4(1,0,0,0),
                new Vector4(0,1,0,0),
                new Vector4(0,0,1,0),
                new Vector4(v.getX(),v.getY(),v.getZ(),1));
        obj2world = matrix.multiplication(obj2world);
    }
    public void multiByScale(Vector3 v)
    {
        Matrix4x4 matrix = new Matrix4x4(new Vector4(v.getX(),0,0,0),
                new Vector4(0,v.getY(),0,0),
                new Vector4(0,0,v.getZ(),0),
                new Vector4(0,0,0,1));
        obj2world =matrix.multiplication(obj2world);
    }
    public void multByRotation(float a, Vector3 v)
    {
        float s = (float)Math.sin(a*Math.PI/180);
        float  c = (float)Math.cos(a*Math.PI/180);
        v = v.normalize();
        Matrix4x4 matrix = new Matrix4x4(new Vector4(v.getX()*v.getX()*(1-c)+c,
                v.getY()*v.getX()*(1-c)+v.getZ()*s,
                v.getX()*v.getZ()*(1-c)-v.getY()*s,
                0),
                new Vector4(v.getX()*v.getY()*(1-c)-v.getZ()*s,
                        v.getY()*v.getY()*(1-c)+c,
                        v.getY()*v.getZ()*(1-c)+v.getX()*s,
                        0),
                new Vector4(v.getX()*v.getZ()*(1-c)+v.getY()*s,
                        v.getY()*v.getZ()*(1-c)-v.getX()*s,
                        v.getZ()*v.getZ()*(1-c)+c,
                        0),
                new Vector4(0,0,0,1));
        obj2world =matrix.multiplication(obj2world);
    }
    public void rst()
    {
        obj2world = new Matrix4x4(new Vector4(1,0,0,0),new Vector4(0,1,0,0),new Vector4(0,0,1,0),new Vector4(0,0,0,1));
    }
}