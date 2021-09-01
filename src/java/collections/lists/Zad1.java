package collections.lists;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,4,5));
        System.out.println(sum1(list));
    }
    public static int sum(List<Integer> a){
        int sum=0;
        Iterator<Integer> iterator=a.iterator();
        while (iterator.hasNext()){
            sum=sum+iterator.next();
            System.out.println(sum);
        }

        return sum;
    }
    public static int sum1(List<Integer> list){
        int sum=0;
        for(Integer element:list){
            sum=sum+element;
        }
        return sum;
    }
}
