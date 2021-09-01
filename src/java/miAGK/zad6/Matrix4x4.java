package miAGK.zad6;

public class Matrix4x4 {
//    Vector4 a,b,c,d;
//
//    //ustawenie macierzy kolumn-order
//
//    public Matrix4x4(Vector4 a, Vector4 b, Vector4 c, Vector4 d) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.d = d;
//    }
//
//    public Matrix4x4() {
//        this.a=new Vector4(1,0,0,0);
//        this.b=new Vector4(0,1,0,0);
//        this.c=new Vector4(0,0,1,0);
//        this.d=new Vector4(0,0,0,1);
//    }
//
//    public Matrix4x4 transpose(){
//        Matrix4x4 m=new Matrix4x4();
//        //1 kolunmna          //2 kolumna            //3 kolumna              //4 kolumna
//        m.a.setY(b.getX());   m.b.setX(a.getY());  m.c.setX(a.getZ());   m.d.setX(a.getD());
//        m.a.setX(a.getX());   m.b.setY(b.getY());  m.c.setZ(c.getZ());   m.d.setD(d.getD());
//        m.a.setZ(c.getX());   m.b.setZ(c.getY());  m.c.setY(b.getZ());   m.d.setY(b.getD());
//        m.a.setD(d.getX());   m.b.setD(d.getY());  m.c.setD(d.getZ());  m.d.setZ(c.getD());
//        return m;
//    }
//
//    @Override
//    public String toString() {
//        return "Matrix4x4{" + System.lineSeparator()
//                + a.getX()+" | "+ b.getX()+" | "+c.getX()+" | "+d.getX() +System.lineSeparator()
//                + a.getY()+" | "+ b.getY()+" | "+c.getY()+" | "+d.getY() +System.lineSeparator()+
//                + a.getZ()+" | "+ b.getZ()+" | "+c.getZ()+" | "+d.getZ() +System.lineSeparator()+
//                + a.getD()+" | "+ b.getD()+" | "+c.getD()+" | "+d.getD() +System.lineSeparator()+
//                '}';
//    }
//
//    public Matrix4x4 multiply(Matrix4x4 m2){
//
//        Matrix4x4 m1=this.transpose();
//        Matrix4x4 m= new Matrix4x4(
//                new Vector4(m1.a.scalM4(m2.a),m1.b.scalM4(m2.a),m1.c.scalM4(m2.a),m1.d.scalM4(m2.a)),
//                new Vector4(m1.a.scalM4(m2.b),m1.b.scalM4(m2.b),m1.c.scalM4(m2.b),m1.d.scalM4(m2.b)),
//                new Vector4(m1.a.scalM4(m2.c),m1.b.scalM4(m2.c),m1.c.scalM4(m2.c),m1.d.scalM4(m2.c)),
//                new Vector4(m1.a.scalM4(m2.d),m1.b.scalM4(m2.d),m1.c.scalM4(m2.d),m1.d.scalM4(m2.d))
//        );
//            return m;
//    }
//    public Matrix4x4 multiplyByK(Matrix4x4 m, float k){
//
//        return new Matrix4x4(m.a.multByK(k), m.b.multByK(k), m.c.multByK(k), m.d.multByK(k));
//    }
//
//     public Vector4 MatrixByVectro(Vector4 v){
//        return new Vector4(this.a.scalM4(v),this.b.scalM4(v),this.c.scalM4(v),this.d.scalM4(v));
//
//     }

        private Vector4 x1;
        private Vector4 x2;
        private Vector4 x3;
        private Vector4 x4;

        public Matrix4x4(Vector4 x1, Vector4 x2, Vector4 x3, Vector4 x4) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
        }

        public Matrix4x4() {
            this.x1 = new Vector4(0,0,0,0);
            this.x2 = new Vector4(0,0,0,0);
            this.x3 = new Vector4(0,0,0,0);
            this.x4 = new Vector4(0,0,0,0);
        }
        @Override
        public String toString() {
            return "Matrix4x4{" + System.lineSeparator()
                + x1.getX()+" | "+ x2.getX()+" | "+x3.getX()+" | "+x4.getX() +System.lineSeparator()
                + x1.getY()+" | "+ x2.getY()+" | "+x3.getY()+" | "+x4.getY() +System.lineSeparator()+
                + x1.getZ()+" | "+ x2.getZ()+" | "+x3.getZ()+" | "+x4.getZ() +System.lineSeparator()+
                + x1.getD()+" | "+ x2.getD()+" | "+x3.getD()+" | "+x4.getD() +System.lineSeparator()+
                '}';
        }

        public Vector4 getX1() {
            return x1;
        }

        public void setX1(Vector4 x1) {
            this.x1 = x1;
        }

        public Vector4 getX2() {
            return x2;
        }

        public void setX2(Vector4 x2) {
            this.x2 = x2;
        }

        public Vector4 getX3() {
            return x3;
        }

        public void setX3(Vector4 x3) {
            this.x3 = x3;
        }

        public Vector4 getX4() {
            return x4;
        }

        public void setX4(Vector4 x4) {
            this.x4 = x4;
        }
        public Matrix4x4 scalMultiply(float x)
        {
            this.getX1().multByK(x);
            this.getX2().multByK(x);
            this.getX3().multByK(x);
            this.getX4().multByK(x);
            return this;
        }

        public Vector4 multiplication(Vector4 f4)
        {

            Vector4 xd =new Vector4(
                    getX1().getX()*f4.getX()+ getX2().getX()*f4.getY() + getX3().getX()*f4.getZ() + getX4().getX()*f4.getD(),
                    getX1().getY()*f4.getX()+ getX2().getY()*f4.getY() + getX3().getY()*f4.getZ() + getX4().getY()*f4.getD(),
                    getX1().getZ()*f4.getX()+ getX2().getZ()*f4.getY() + getX3().getZ()*f4.getZ() + getX4().getZ()*f4.getD(),
                    getX1().getD()*f4.getX()+ getX2().getD()*f4.getY() + getX3().getD()*f4.getZ() + getX4().getD()*f4.getD()
            );
            return xd;
        }
        public static Matrix4x4 setIdentity()
        {

            return new Matrix4x4(new Vector4(1,0,0,0),
                    new Vector4(0,1,0,0),
                    new Vector4(0,0,1,0),
                    new Vector4(0,0,0,1));
        }
        ///GOOD
        public Matrix4x4 multiplication(Matrix4x4 f4x4)
        {
            Matrix4x4 matrix = new Matrix4x4();
            // f4x4 =f4x4.transposeMatrix();
            //x columns, y  rows
            float x1y1 = this.getX1().getX()*f4x4.getX1().getX() +
                    this.getX2().getX()*f4x4.getX1().getY() +
                    this.getX3().getX()*f4x4.getX1().getZ() +
                    this.getX4().getX()*f4x4.getX1().getD();
            float x2y1 = this.getX1().getX()*f4x4.getX2().getX() +
                    this.getX2().getX()*f4x4.getX2().getY() +
                    this.getX3().getX()*f4x4.getX2().getZ() +
                    this.getX4().getX()*f4x4.getX2().getD();

            float x3y1 = this.getX1().getX()*f4x4.getX3().getX() +
                    this.getX2().getX()*f4x4.getX3().getY() +
                    this.getX3().getX()*f4x4.getX3().getZ() +
                    this.getX4().getX()*f4x4.getX3().getD();
            float x4y1 = this.getX1().getX()*f4x4.getX4().getX() +
                    this.getX2().getX()*f4x4.getX4().getY() +
                    this.getX3().getX()*f4x4.getX4().getZ() +
                    this.getX4().getX()*f4x4.getX4().getD();

            float x1y2 = this.getX1().getY()*f4x4.getX1().getX() +
                    this.getX2().getY()*f4x4.getX1().getY() +
                    this.getX3().getY()*f4x4.getX1().getZ() +
                    this.getX4().getY()*f4x4.getX1().getD();
            float x2y2 = this.getX1().getY()*f4x4.getX2().getX() +
                    this.getX2().getY()*f4x4.getX2().getY() +
                    this.getX3().getY()*f4x4.getX2().getZ() +
                    this.getX4().getY()*f4x4.getX2().getD();

            float x3y2 = this.getX1().getY()*f4x4.getX3().getX() +
                    this.getX2().getY()*f4x4.getX3().getY() +
                    this.getX3().getY()*f4x4.getX3().getZ() +
                    this.getX4().getY()*f4x4.getX3().getD();
            float x4y2 = this.getX1().getY()*f4x4.getX4().getX() +
                    this.getX2().getY()*f4x4.getX4().getY() +
                    this.getX3().getY()*f4x4.getX4().getZ() +
                    this.getX4().getY()*f4x4.getX4().getD();


            float x1y3 = this.getX1().getZ()*f4x4.getX1().getX() +
                    this.getX2().getZ()*f4x4.getX1().getY() +
                    this.getX3().getZ()*f4x4.getX1().getZ() +
                    this.getX4().getZ()*f4x4.getX1().getD();
            float x2y3 = this.getX1().getZ()*f4x4.getX2().getX() +
                    this.getX2().getZ()*f4x4.getX2().getY() +
                    this.getX3().getZ()*f4x4.getX2().getZ() +
                    this.getX4().getZ()*f4x4.getX2().getD();

            float x3y3 = this.getX1().getZ()*f4x4.getX3().getX() +
                    this.getX2().getZ()*f4x4.getX3().getY() +
                    this.getX3().getZ()*f4x4.getX3().getZ() +
                    this.getX4().getZ()*f4x4.getX3().getD();
            float x4y3 = this.getX1().getZ()*f4x4.getX4().getX() +
                    this.getX2().getZ()*f4x4.getX4().getY() +
                    this.getX3().getZ()*f4x4.getX4().getZ() +
                    this.getX4().getZ()*f4x4.getX4().getD();



            float x1y4 = this.getX1().getD()*f4x4.getX1().getX() +
                    this.getX2().getD()*f4x4.getX1().getY() +
                    this.getX3().getD()*f4x4.getX1().getZ() +
                    this.getX4().getD()*f4x4.getX1().getD();
            float x2y4 = this.getX1().getD()*f4x4.getX2().getX() +
                    this.getX2().getD()*f4x4.getX2().getY() +
                    this.getX3().getD()*f4x4.getX2().getZ() +
                    this.getX4().getD()*f4x4.getX2().getD();

            float x3y4 = this.getX1().getD()*f4x4.getX3().getX() +
                    this.getX2().getD()*f4x4.getX3().getY() +
                    this.getX3().getD()*f4x4.getX3().getZ() +
                    this.getX4().getD()*f4x4.getX3().getD();
            float x4y4 = this.getX1().getD()*f4x4.getX4().getX() +
                    this.getX2().getD()*f4x4.getX4().getY() +
                    this.getX3().getD()*f4x4.getX4().getZ() +
                    this.getX4().getD()*f4x4.getX4().getD();



            matrix.setX1(new Vector4(x1y1,x1y2,x1y3,x1y4));
            matrix.setX2(new Vector4(x2y1,x2y2,x2y3,x2y4));
            matrix.setX3(new Vector4(x3y1,x3y2,x3y3,x3y4));
            matrix.setX4(new Vector4(x4y1,x4y2,x4y3,x4y4));
            return  matrix;
        }
        public Vector4 multiplication(Vector3 f3)
        {
            return new Vector4(
                    getX1().getX()*f3.getX() +   getX2().getY()*f3.getY() + getX3().getX()*f3.getZ() + getX4().getX(),
                    getX1().getY()*f3.getX() +   getX2().getY()*f3.getY() + getX3().getY()*f3.getZ() + getX4().getY(),
                    getX1().getZ()*f3.getX() +   getX2().getZ()*f3.getY() + getX3().getZ()*f3.getZ() + getX4().getZ(),
                    getX1().getD()*f3.getX() +   getX2().getD()*f3.getY() + getX3().getD()*f3.getZ() + getX4().getD()
            );
        }
        //green transpose
        public Matrix4x4 transposeMatrix()
        {
            Vector4 c1, c2,c3,c4;
            c1 = new Vector4(this.getX1().getX(),this.getX2().getX(),this.getX3().getX(),this.getX4().getX());
            c2 = new Vector4(this.getX1().getY(),this.getX2().getY(),this.getX3().getY(),this.getX4().getY());
            c3 = new Vector4(this.getX1().getZ(),this.getX2().getZ(),this.getX3().getZ(),this.getX4().getZ());
            c4 = new Vector4(this.getX1().getD(),this.getX2().getD(),this.getX3().getD(),this.getX4().getD());
            return  new Matrix4x4(c1,c2,c3,c4);
        }
}
