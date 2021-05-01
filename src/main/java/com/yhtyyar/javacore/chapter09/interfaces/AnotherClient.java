package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class AnotherClient  implements CallBack{

    public void callBack (int p) {
        System.out.println("Ещё один вариант метода  callBack() ");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
