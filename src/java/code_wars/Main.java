package code_wars;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Ala ma Kota"));
    }
    public  static  String reverse(String frase){

        String []arr=frase.split("");
        String result="";
        for (int i= arr.length-1;i>=0;i--){
            result+=arr[i];
        }
        return result;
    }

}
