package miAGK.zad6;

import java.util.ArrayList;
import java.util.List;

public class Mesh {
    private List<Triangle> list;
    private List<Vector3[]> listUtil;

    public Mesh() {
        list = new ArrayList<>();
        listUtil = new ArrayList<>();
    }

    public List<Triangle> getList() {
        return list;
    }

    public void setList(List<Triangle> list) {
        this.list = list;
    }

    public List<Vector3[]> getListUtil() {
        return listUtil;
    }

    public void setListUtil(List<Vector3[]> listUtil) {
        this.listUtil = listUtil;
    }


}
