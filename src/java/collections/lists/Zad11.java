package collections.lists;

import java.util.HashMap;
import java.util.Map;

public class Zad11 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("PL","Polamd");
        map.put("Ger","German");
        krasivo(map);

    }
    public static void krasivo(Map<String,String> map){
//        for (String key:map.keySet()){
//            System.out.println(key+"->"+map.get(key));
//
//        }
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());

        }

    }

}
