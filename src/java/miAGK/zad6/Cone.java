package miAGK.zad6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cone {
    List<Triangle> traingleList = new ArrayList<>();
    List<Vector3> vertexList = new ArrayList<>();
    Vector3 peakVertex;
    Cone(float r, float h, Vector3 center, int basisSegments)
    {
        float cost = 0;
        float sint = 0;
        peakVertex = new Vector3(center.getX(), center.getY()+h, center.getZ());
        for(int i =0;i<basisSegments;i++)
        {
            cost = (float)Math.cos(2*Math.PI*(i)/basisSegments);
            sint = (float)Math.sin(2*Math.PI*(i)/basisSegments);
            vertexList.add(new Vector3(center.getX()+r*cost,center.getY(),center.getZ()+r*sint));
        }
        Vector3 tempVect;
        for(int i =0;i<vertexList.size()-1;i++)
        {
            tempVect = vertexList.get(i);
            traingleList.add(new Triangle(center,vertexList.get(i),vertexList.get(i+1),new Color(242, 0, 0),
                    new Color(0, 255, 0),
                    new Color(0, 0, 245)));
            traingleList.add(new Triangle(peakVertex,vertexList.get(i+1),vertexList.get(i),new Color(242, 0, 0),
                new Color(0, 255, 0),
                new Color(0, 0, 245)));
        }
        traingleList.add(new Triangle(center,vertexList.get(vertexList.size()-1),vertexList.get(0),new Color(242, 0, 0),
                new Color(0, 255, 0),
                new Color(0, 0, 245)));
        traingleList.add(new Triangle(peakVertex,vertexList.get(0),vertexList.get(vertexList.size()-1),new Color(242, 0, 0),
            new Color(0, 255, 0),
            new Color(0, 0, 245)));
    }
}
