package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class DynStack implements IntStack{

    private int [] stck;
    private int tos;

    DynStack (int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        //Если стек заполнен, выделить под стек большего размера(в два раза)
        if(tos == stck.length - 1) {
            int [] temp = new int[stck.length * 2]; // удвоение размера стека
            for (int i = 0; i < stck.length; i++) {
                temp[i] =stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck [++tos] = item;
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
