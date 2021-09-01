package strings;

public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println(separ("Telewizor"));
    }

    public static String separ(String slovo){
        String []arr=slovo.split("");
        String parz="";
        String niepar="";
        for(int i=0;i<arr.length;i++){
            if (i%2==0){
                parz=parz+arr[i];
            }else {
                niepar=niepar+arr[i];
            }
        }
        return parz+niepar;
    }
}
