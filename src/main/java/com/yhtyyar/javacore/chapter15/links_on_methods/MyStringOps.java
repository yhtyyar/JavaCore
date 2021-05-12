package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class MyStringOps {

    static String strReverse (String str) {
        String result = "";

        int i;

        for (i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

     String strReverse2 (String str) {
        String result = "";

        int i;

        for (i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


}
