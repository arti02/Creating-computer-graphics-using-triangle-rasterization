package collections.lists;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Zad12 {
    public static void main(String[] args) {
        String b="Slozno";
        System.out.println(slozno(b));
    }
    public static Map<String, List<Integer>> slozno(String napis){
        Map<String,List<Integer>>nowaja=new TreeMap<>();
        String []arr=napis.toLowerCase().split("");
        for (int i=0;i<arr.length;i++){
            List<Integer> list;
            if (nowaja.containsKey(arr[i])){
                list=nowaja.get(arr[i]);
                list.add(i);
                nowaja.put(arr[i],list);
            }else{
                list=new ArrayList<>();
                list.add(i);
                nowaja.put(arr[i],list);

            }
        }

        return nowaja;
    }

}
