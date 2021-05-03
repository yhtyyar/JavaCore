package main.java.com.yhtyyar.javacore.chapter18.comparator.then_comparing;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {

    public int compare(String aStr, String bStr) {

        int i,j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
