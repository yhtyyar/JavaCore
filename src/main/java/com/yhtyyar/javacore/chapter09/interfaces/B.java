package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class B implements A.NestedIF{

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }


}
