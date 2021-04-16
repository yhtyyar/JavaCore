package main.java.com.yhtyyar.javacore.chapter07.classes;

public class Outer {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i ++) {
            class Inner {

                void display() {
                    System.out.println("Вывод: outer_x = " + outer_x);
                }
            }

        Inner inner = new Inner();
        inner.display();
        }
    }


//    void showy() {             // переменная y недоступна в классе Outer
//        System.out.println(y);
//    }


}
