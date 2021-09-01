package miAGK.zad6;


import javafx.scene.transform.MatrixType;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Rasterizer rast=new Rasterizer(840,600);
        int width=rast.width;
        int hiegth=rast.hiegth;
        BufferedImage image= Rasterizer.Rectangle(width,hiegth,0Xaaccdd);
        VertexProcssor vert=new VertexProcssor();
        VertexProcssor vert1=new VertexProcssor();
        //1
        Vector3 t1 = new Vector3(-0.5f, -1f, 0.9f);
        Vector3 t2 = new Vector3(-0.3f, 1f, 0.9f);
        Vector3 t3 = new Vector3(0.9f, 0.8f, 0.9f);
        //2
        Vector3 t4 = new Vector3(.5f, -1f, 1f);
        Vector3 t5 = new Vector3(-0.4f, 0.8f, 1f);
        Vector3 t6 = new Vector3(.7f, 1f, 1f);
        VertexProcssor.setPerspective(80f,1f,1,1000f);
        VertexProcssor.setLookat(new Vector3(0,0,-1.4f),new Vector3(0,0,0), new Vector3(0,1,0));

        vert1.multByRotation(30,new Vector3(1f,0,0));
        vert1.multiByScale(new Vector3(0.5f,0.5f,0));
        vert1.multiByTranslation(new Vector3(0.3f,0.3f,0));

       /* Cone cone = new Cone(0.5f,1.1f,new Vector3(0.2f,-0.4f,0), 6);
        for (Triangle triangle: cone.traingleList) {
            Triangle triangle1=new Triangle(vert1.tR(triangle.getA()),
                    vert1.tR(triangle.getB()),
                    vert1.tR(triangle.getC()),
                    new Color(242,0,0),
                    new Color(0,255,0),
                    new Color(0,0,245));
            Rasterizer.DrawTriangl(width, hiegth, triangle1, image);
        }
*/
        Sphere sphere=new Sphere(12,12,new Color(241,1,1));
        for (Triangle triangle: sphere.triangles) {
            Triangle triangle1 = new Triangle(vert1.tR(triangle.getA()),
                    vert1.tR(triangle.getB()),
                    vert1.tR(triangle.getC()),
                    new Color(255, 120, 150),
                    new Color(155, 255, 0),
                    new Color(255, 0, 0));
            Rasterizer.DrawTriangl(width, hiegth, triangle1, image);
        }
        /*vert.multByRotation(60,new Vector3(1,0,0));
        vert.multiByTranslation(new Vector3(-1f,-0.3f,0));
        vert.multiByScale(new Vector3(0.5f,0.5f,0.5f));*/
      /*  Torus torus = new Torus(0.5f,0.3f,8,8);
       for (Triangle triangle: torus.list
        ) {
            Triangle tr3=new Triangle( vert.tR(triangle.getA()),
                    vert.tR(triangle.getB()),
                    vert.tR(triangle.getC()),
                    new Color(12,47,111),
                    new Color(155,122,22),
                    new Color(16,202,45));
           Rasterizer.DrawTriangl(width, hiegth, tr3, image);
        }*/
//        Pyramid pyramid=new Pyramid();
//        List<Triangle> list= pyramid.createPyramid(4,0.5f,0.7f,0.7f).getList();
//        for (Triangle n:list){
//
//            Triangle triangle=vert.(n);
//////            System.out.println(n);
//////            System.out.println(triangle);
//////            n.setA(vert.tRVec(n.getA()));
//////            n.setB(vert.tRVec(n.getB()));
//////            n.setC(vert.tRVec(n.getC()));
//            Rasterizer.DrawTriangl(width, hiegth, triangle, image);
//        }

////        Triangle triangle=vert.tR(v2);
//        Triangle triangle1=vert.tR(v1);
//        Rasterizer.DrawTriangl(width, hiegth, t, image);
////        Rasterizer.DrawTriangl(width, hiegth, triangle, image);


        // Save as JPEG
        File file = new File("myimage.png");
        ImageIO.write((image), "png", file);

    }


}



