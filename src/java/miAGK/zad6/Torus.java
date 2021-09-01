package miAGK.zad6;

import java.util.ArrayList;
import java.util.List;

public class Torus {
    List<Triangle> list=  new ArrayList<>();
    public Torus(float radius, float thickness, int horSeg, int verSegment)
    {
        double ang_rad = Math.PI/((float)horSeg/2);
        double ang_thick = Math.PI/((float)verSegment/2);
        for( int i =0;i<horSeg;i++)
        {
            double sini = Math.sin(ang_rad*i) *radius;
            double sini1 = Math.sin(ang_rad*(i+1)) *radius;
            double cosi = Math.cos(ang_rad*i) *radius;
            double cosi1 = Math.cos(ang_rad*(i+1)) *radius;

            for(int j =0; j<verSegment;j++)
            {
                double sinj = Math.sin(ang_thick*j) *thickness;
                double sinj1 = Math.sin(ang_thick*(j+1)) *thickness;
                double cosj = Math.cos(ang_thick*j) *thickness;
                double cosj1 = Math.cos(ang_thick*(j+1)) *thickness;

                Vector3 v1 = new Vector3((float)(sini + (sinj * sini)), (float)(cosj), (float)(cosi + (sinj * cosi)));
                Vector3 v2 = new Vector3((float)(sini1 + (sinj * sini1)), (float)(cosj), (float)(cosi1 + (sinj * cosi1)));
                Vector3 v3 = new Vector3((float)(sini + (sinj1 * sini)), (float)(cosj1), (float)(cosi + (sinj1 * cosi)));
                Vector3 v4 = new Vector3((float)(sini1 + (sinj1 * sini1)), (float)(cosj1), (float)(cosi1 + (sinj1 * cosi1)));
                list.add(new Triangle(v1,v3,v2));
                list.add(new Triangle(v2,v3,v4));
            }


        }

    }
}
