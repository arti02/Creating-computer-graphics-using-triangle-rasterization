package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad5 {
    public static void main(String[] args) {
        List<Integer> nowy=new ArrayList<>(Arrays.asList(1,5,9,6,9,7,6));
        System.out.println(slozno(nowy, 1, 4));
    }
    public static int slozno(List<Integer> list, int start,int koniec){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int roznica=0;
        for (int i=start;i<koniec;i++){
            if (list.get(i)>max){
                max=list.get(i);
            }
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println(max);
        System.out.println(min);
        roznica=max-min;
        System.out.println(roznica);
        if (roznica<0||roznica>list.size()-1){

            return -1;
        }else {
            return list.get(roznica);
        }


    }
}
