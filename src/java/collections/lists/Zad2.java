package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(2,3,5)) ;
        System.out.println(max(list));
    }
    public static int max(List<Integer> list){
        int max=Integer.MIN_VALUE;
        for(Integer element:list){
            if(element>max){
                max=element;
            }
        }
        return max;
    }
}
