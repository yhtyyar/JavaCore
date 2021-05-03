package main.java.com.yhtyyar.javacore.chapter18.comparator.then_comparing;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i,j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
