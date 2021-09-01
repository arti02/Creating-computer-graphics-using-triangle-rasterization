package lekcja2_arrays;

public class Zadanie14 {
    public static void main(String[] args) {
    int []f=new int[]{12,34,12,54,54};
        System.out.println(df(f));
    }
    public static int df(int[]arr ){
        int summa=0;
        int wystapenia=0;
        int max = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=max){

                summa=summa+arr[i];
            }else{
                wystapenia++;
            }
        }
        System.out.println(summa);
        return summa/ (arr.length-wystapenia);
    }

}
