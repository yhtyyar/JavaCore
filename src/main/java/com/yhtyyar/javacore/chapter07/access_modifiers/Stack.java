package main.java.com.yhtyyar.javacore.chapter07.access_modifiers;

public class Stack {

    private int [] stck ;
    private int tos;

    /*  Теперь переменные stck и tos  являются закрытыми. Их нельзя
    изменить случайно или намеренно, чтобы нарушить стек.
     */


    Stack () {
        tos = -1;
    }

    Stack( int size) {
        stck = new int[size];
        tos = -1;
    }

    void push (int item) {    // Размещение элемента в стеке
        if(tos == stck.length-1) {
            System.out.println("Стек заполнен.");
        } else {
            stck [++tos] = item;
        }
    }

    int pop() {             // Извлечение элемента из стека
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck [tos--];
        }
    }
}
