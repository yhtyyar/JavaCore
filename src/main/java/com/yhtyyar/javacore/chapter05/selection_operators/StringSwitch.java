package main.java.com.yhtyyar.javacore.chapter05.selection_operators;

public class StringSwitch {

    public static void main(String [] args) {

        String str = "three";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            case "four":
                System.out.println("four");
                break;
            default:
                System.out.println("did not match");

        }
    }
}
