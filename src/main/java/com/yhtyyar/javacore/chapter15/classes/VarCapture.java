package main.java.com.yhtyyar.javacore.chapter15.classes;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.MyFunc;

public class VarCapture {

    static int m = 6;

    public static void main(String [] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {

            int v = num + n;

            // видеоизменение перемнной num недопустима
    //      num++;

            m++;

          return v;
        };

        // такое видоизменение тоже не допустима
    //  num = 9;
    }
}
