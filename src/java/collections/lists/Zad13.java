package collections.lists;

import java.util.*;


public class Zad13 {
    public static void main(String[] args) {
        Map<String,Integer> hopa=new HashMap<>();
        hopa.put("l",0);
        hopa.put("o",1);
        hopa.put("h",2);
        krasivo(napis(hopa));;
    }
    public static String[] napis(Map<String,Integer>  map){
    String napis="";
        String[]arr=new String[map.size()];
        for (String k:map.keySet()){
             arr[map.get(k)]=k;
        }
    return arr;
    }
    public static void krasivo(String[]arr){
        for (String n:arr){
            System.out.print(n);
        }
    }

}
