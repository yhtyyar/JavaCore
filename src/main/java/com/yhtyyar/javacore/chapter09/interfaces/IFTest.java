package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class IFTest {

    public static void main(String [] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for(int i = 0; i < 5; i++)
            mystack1.push(i);

        for (int i = 0; i < 8; i++)
            mystack2.push(i);

        System.out.println("Стек mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());

    }
}
