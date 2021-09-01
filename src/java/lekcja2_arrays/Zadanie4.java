package lekcja2_arrays;

public class Zadanie4 {
    public static void main(String[] args) {
        int[]c=new int[]{20,34,56};
        System.out.println(mjaso(c, 37));
    }
    public static boolean mjaso(int[]arr,int a){
      for (int i=0;i<arr.length;i++){
          if (a==arr[i]){
              return true;
          }
        }
     return false;
    }
}
