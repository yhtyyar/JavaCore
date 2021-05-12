package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class HighTemp {

    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp (HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
