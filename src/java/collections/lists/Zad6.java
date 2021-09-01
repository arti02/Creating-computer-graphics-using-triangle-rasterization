package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad6 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,4,2,1,1));
        System.out.println(norm(list1, 1));
    }
    public static List<Integer> norm(List<Integer> list,int cyfra){
        List<Integer> nowy=new ArrayList();
        for (int i=0;i<list.size();i++){
            if (list.get(i).equals(cyfra)){
                nowy.add(i);

            }
        }
        return nowy;
    }
}

