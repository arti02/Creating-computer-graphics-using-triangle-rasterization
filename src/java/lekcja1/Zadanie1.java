package lekcja1;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Zadanie1 {

    public static void main(String[] args) {


        System.out.println(prawda(60,80,34));
    }

    public static int prawda(int a, int b, int c) {

        if (a > b && a > c) {

            return a;
        } else if (b > a && b > c) {
            return b;
        }else{
                return c;
            }
        }


    }






