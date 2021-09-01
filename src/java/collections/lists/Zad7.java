package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad7 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(10,45,67,31,65)) ;
        System.out.println(krocimy(list1, 2));

    }
    public static List<Integer> krocimy(List<Integer> list, int index){
        List<Integer> nowy=new ArrayList<>();
        for (int i=index+1;i< list.size();i++){
          nowy.add(list.get(i));
        }
        return nowy;
    }
}
