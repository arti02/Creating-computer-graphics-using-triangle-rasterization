package strings;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println(logpod("Artem Udovenko"));
    }
    public static String login(String name,String surname){
        String log=name.substring(0,3)+surname.substring(0,3)+(name.length()+surname.length());
    return log;
    }

    public static String logpod(String dane){
        String []b=dane.split(" ");
        return b[0].substring(0,3)+b[1].substring(0,3)+(dane.length()-1);
    }

}
