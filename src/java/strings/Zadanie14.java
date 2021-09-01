package strings;

import java.util.Arrays;

public class Zadanie14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bez0((powt("aabbbc")))));
    }
    public static int [] powt(String slovo){
        String[]arr=slovo.split("");
        String element=arr[0];
        int[]nowy=new int[arr.length];
        int index=0;
        int licznik=0;
        for (int i=0;i< arr.length;i++){

            if (element.equals(arr[i])){
                licznik++;
            }else {
                nowy[index]=licznik;
                licznik=1;
                element=arr[i];

                index++;
            }
        }
        nowy[index]=licznik;
        return nowy;
    }
    public static int[] bez0(int[]arr){
        int licznik=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                licznik++;
            }
        }
        int []nowy=new int[arr.length-licznik];
        for (int i=0;i< arr.length-licznik;i++){
            if (arr[i]!=0){
                nowy[i]=arr[i];
            }
        }
        return nowy;
    }
}
