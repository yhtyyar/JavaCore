package main.java.com.yhtyyar.javacore.chapter05.selection_operators;

public class SampleSwitch {

    public static void main(String  [] args) {

        for(int i =  0; i < 7; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трём.");
                    break;
                default:
                    System.out.println("i больше трёх.");

            }
    }
}
