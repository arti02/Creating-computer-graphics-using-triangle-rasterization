package strings;

public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println(cyfra("axyexal nasz autobus", 'a'));
    }
    public static int cyfra(String sentence,char znak){
        char []b=sentence.toCharArray();
        int liczba=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==znak){
                liczba++;
            }
        }
        return liczba;
    }
}
