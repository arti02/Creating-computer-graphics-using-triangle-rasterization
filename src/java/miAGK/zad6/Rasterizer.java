package miAGK.zad6;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Rasterizer {
    int width;
    int hiegth;
    static float[][] depthBuffer;

    public Rasterizer(int width, int hiegth) {
        this.width=width;
        this.hiegth=hiegth;
        depthBuffer = new float[width][hiegth];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < hiegth; j++) {
                depthBuffer[i][j] = 100000;
            }
        }
    }


    public static BufferedImage DrawTriangl(int width, int height, Triangle v,
                                            BufferedImage img) throws IOException{
        //tworzenie depth buffera

        float[][] depthBuffer1 = depthBuffer;

        float x1 = (v.getA().getX() + 1) * width * .5f;
        float x2 = (v.getB().getX() + 1) * width * .5f;
        float x3 = (v.getC().getX() + 1) * width * .5f;

        float y1 = (v.getA().getY() + 1) * height * .5f;
        float y2 = (v.getB().getY() + 1) * height * .5f;
        float y3 = (v.getC().getY() + 1) * height * .5f;

        float maxx = Rasterizer.max( x1, x2,x3);
        float minx = Rasterizer.min( x1,x2,x3);
        float maxy = Rasterizer.max( y1, y2, y3);
        float miny = Rasterizer.min( y1,  y2,  y3);
        //obcinanie
//        minx = Integer.max(minx, 0);
//        maxx = Integer.min(maxx, width - 1);
//        miny = Integer.max(miny, 0);
//        maxy = Integer.min(maxy, height - 1);


        float dx12 = x1 - x2;
        float dx23 = x2 - x3;
        float dx31 = x3 - x1;
        float dy12 = y1 - y2;
        float dy23 = y2 - y3;
        float dy31 = y3 - y1;
        boolean topleft1=false;
        boolean topleft2=false;
        boolean topleft3=false;
        if (dy12<0||(dy12==0&&dx12>0)){
            topleft1=true;
        }
        if (dy23<0||(dy23==0&&dx23>0)){
            topleft2=true;
        }
        if (dy31<0||(dy31==0&&dx31>0)) {
            topleft3 = true;
        }
        int[] colorbuffer2 = new int[3];
        //rysowanie trojkata
        for (int i = (int) minx; i < maxx; i++) {
            for (int j = (int) miny; j < maxy; j++) {
                float d1 = dx12 * (j - y1) - dy12 * (i - x1);
                float d2=dx23 * (j - y2) - dy23 * (i - x2);
                float d3=dx31 * (j - y3) - dy31 * (i - x3);
                if ((d1 > 0 && !topleft1|| d1 >= 0 && topleft1)&&
                 (d2 > 0 && !topleft2|| d2 >= 0 && topleft2)
                && (d3 > 0 && !topleft3|| d3 >= 0 && topleft3)) {
//
                    float lambda1 = (dy23 * (i - x3) + (x3 - x2) * (j - y3)) / (dy23 * (x1 - x3) + (x3 - x2) * (y1 - y3));
                    float lambda2 = (dy31 * (i - x3) + (x1 - x3) * (j - y3)) / (dy31 * (x2 - x3) + (x1 - x3) * (y2 - y3));
                    float lambda3 = 1.0f - lambda1 - lambda2;
                    float depth = (lambda1 * v.getA().getZ() + lambda2 * v.getB().getZ() + lambda3 * v.getC().getZ());
                    try {

                        if (depth < depthBuffer1[i][j]) {
                            depthBuffer1[i][j] = depth;
                            int r = (int) (lambda1 * v.color1.getRed() + lambda2 * v.color2.getRed() + lambda3 * v.color3.getRed());
                            int g = (int) (lambda1 * v.color1.getGreen() + lambda2 * v.color2.getGreen() + lambda3 * v.color3.getGreen());
                            int b= (int) (lambda1 * v.color1.getBlue() + lambda2 * v.color2.getBlue() + lambda3 * v.color3.getBlue());
//                            for (int k =0;k<3;k++)
//                            {
//                                if(colorbuffer2[k]>255)
//                                {
//                                    colorbuffer2[k]=255;
//                                }
//                                if(colorbuffer2[k]<0)
//                                {
//                                    colorbuffer2[k]=0;
//                                }
//                            }
                            Color color = new Color(r, g, b);
                            img.setRGB(i,height- j-1, color.getRGB());

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        depthBuffer = depthBuffer1;
        return img;
    }

//

    // Rysowanie tla
    public static BufferedImage Rectangle(int width, int height, int color) {

        int[][] arr = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                arr[i][j] = color;
            }
        }
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                bufferedImage.setRGB(i, j, arr[i][j]);
            }
        }
        return bufferedImage;
    }
    public static float min(float x1, float x2, float x3)
    {
        float y = x1;
        if (y > x2)
        {
            y = x2;
        }
        if (y > x3)
        {
            y = x3;
        }
        return y;
    }
    public static float max(float x1, float x2, float x3)
    {
        float y = x1;
        if (y < x2)
        {
            y = x2;
        }
        if (y < x3)
        {
            y = x3;
        }
        return y;
    }
    public static float min(float x1, float x2)
    {
        float y = x1;
        if (y > x2)
        {
            y = x2;
        }

        return y;
    }
    public static float max(float x1, float x2)
    {
        float y = x1;
        if (y < x2)
        {
            y = x2;
        }

        return y;
    }

}
