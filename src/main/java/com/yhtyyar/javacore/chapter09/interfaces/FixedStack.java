package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class FixedStack implements IntStack {

    private int [] stck;
    private int tos;

    FixedStack(int size) {

        stck = new int[size];
        tos= -1;
    }

    public  void push(int item) {
        if(tos == stck.length -1) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}
