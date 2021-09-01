package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>(Arrays.asList("a","b","c"));
        System.out.println(reverse(list1));
    }
    public static List<String> reverse(List<String> list){

        Collections.reverse(list);
        return list;
    }
}
