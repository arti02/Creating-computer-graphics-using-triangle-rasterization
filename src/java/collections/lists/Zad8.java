package collections.lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Zad8 {
    public static void main(String[] args) {
        List epta=new LinkedList(Arrays.asList(10,21,53,56,3,1));
        System.out.println(del(epta));
    }
    public static List<List<Integer>> del(List<Integer>liststart){
        List<Integer> listpar=new LinkedList<>();
        List<Integer> listniep=new LinkedList<>();
        List<List<Integer>> koncowa=new LinkedList<>();
        for(Integer n:liststart){
            if (n%2==0){
                listpar.add(n);
            }else{
                listniep.add(n);
            }
        }
        koncowa.add(0,listpar);
        koncowa.add(1,listniep);
        return koncowa;
    }


}
