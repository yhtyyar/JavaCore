package main.java.com.yhtyyar.javacore.chapter18.comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {

    public int compare(String aStr, String bStr) {

        int i, j, k;

        // определение индекса первой буквы фамилии
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}
