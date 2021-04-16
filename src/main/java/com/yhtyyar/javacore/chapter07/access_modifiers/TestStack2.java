package main.java.com.yhtyyar.javacore.chapter07.access_modifiers;

public class TestStack2 {

    public static void main(String [] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        for (int i = 0; i < 5; i++)
            mystack1.push(i);

        for (int i = 0; i < 8; i++)
            mystack2.push(i);

        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());

        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
    }
}
