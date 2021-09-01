package collections.lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zad10 {
    public static void main(String[] args) {
        Set<Integer> now=new HashSet<>(Arrays.asList(1,4,56,87,57));
        System.out.println(wieksze(now, 3));
    }
    public static Set<Integer> wieksze(Set<Integer> set1,double a){
        Set<Integer>nowy=new HashSet<>();
        for (Integer n:set1){
            if (a<n){
                nowy.add(n);
            }

        }
        return nowy;
    }
}
