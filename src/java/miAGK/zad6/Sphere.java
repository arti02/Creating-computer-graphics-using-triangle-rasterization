package miAGK.zad6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sphere {
    List<Triangle> triangles = new ArrayList<>();
  //  List<Fragment> fragments = new ArrayList<>();
    Vertex[] vertexList;
    Int3[] indices;
    Color color;
    Sphere(int horizontalSegments, int verticalsSegments, Color color )
    {
        this.color =color;
        indices = new Int3[2*verticalsSegments*horizontalSegments];
        vertexList = new Vertex[verticalsSegments*(horizontalSegments+2)];

        float x,y,z,r;
        for(int i =0;i<=horizontalSegments+1;i++)
        {
            y = (float)Math.cos(i*Math.PI/(horizontalSegments+1.f));
            r =(float) Math.sqrt(1-y*y);
            for(int j =0;j<verticalsSegments;j++)
            {
                x = r*(float)Math.cos(2*Math.PI*j/verticalsSegments);
                z = r*(float)Math.sin(2*Math.PI*j/verticalsSegments);
                vertexList[j+i*verticalsSegments] =  new Vertex(new Vector3(0,0,0),null,new Vector3(x,y,z));
            }
        }
        for ( int yy=0; yy<horizontalSegments ; ++yy )
            for ( int rr=0; rr<verticalsSegments ; ++rr )
            {
                int z1 = (rr + 1) % verticalsSegments + verticalsSegments + yy * verticalsSegments;
                indices [ rr + 2* yy*verticalsSegments ] = new Int3(
                        ( rr+1) % verticalsSegments + yy*verticalsSegments ,
                        rr+verticalsSegments + yy*verticalsSegments,
                        z1
                );
                indices [ rr+verticalsSegments + 2* yy* verticalsSegments ] = new Int3 (
                        rr+verticalsSegments + yy*verticalsSegments ,
                        rr+2*verticalsSegments + yy*verticalsSegments ,
                        z1
                );
            }
        for (int i =0; i <2*verticalsSegments*horizontalSegments;i++)
        {

            Vector3 N =
                    vertexList[indices[i].z].position.vecSub(vertexList[indices[i].x].position).vecCross(
                            vertexList[indices[i].y].position.vecSub(vertexList[indices[i].x].position));
            N = N.normalize();
            vertexList[indices[i].x].N =    vertexList[indices[i].x].N.addVector(N);
            vertexList[indices[i].y].N =    vertexList[indices[i].y].N.addVector(N);
            vertexList[indices[i].z].N =    vertexList[indices[i].z].N.addVector(N);

        }
        for(int i =0;i<verticalsSegments*(horizontalSegments+2);i++)
        {
            vertexList[i].N = vertexList[i].N.normalize();
        }
        for(int i =0; i <2*verticalsSegments*horizontalSegments; i++)
        {
            triangles.add(new Triangle(
                    vertexList[indices[i].x].position,
                    vertexList[indices[i].y].position,
                    vertexList[indices[i].z].position,
                    vertexList[indices[i].x].N,
                    vertexList[indices[i].y].N,
                    vertexList[indices[i].z].N));
        }


    }
}
