package strings;

public class Zadanie2 {

    public static void main(String[] args) {
        System.out.println(fd("JA pOZHOL NA "));

    }
    public static int dlina(String d){
        int sum =0;
        String[] b=d.split(" ");

        for(String i:b){
            sum=sum+i.length();
        }
        return sum;
    }
    public static int fd(String f){
        int sum =0;
        String b=f.replace(" ","");
        return b.length();
    }
}
