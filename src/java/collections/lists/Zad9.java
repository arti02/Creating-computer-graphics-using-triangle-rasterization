package collections.lists;

import java.util.*;

public class Zad9 {
    public static void main(String[] args) {
        System.out.println(powtorka());
    }
    public static Set<Integer> powtorka(){
        Set<Integer> koncowy=new HashSet<>();
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.print("веди число ");
            int i=s.nextInt();
            if (koncowy.add(i)){
                koncowy.add(i);
            }else {
                break;
            }
        }

        return koncowy;
    }

}
