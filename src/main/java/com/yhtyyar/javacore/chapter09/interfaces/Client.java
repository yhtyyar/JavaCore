package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class Client implements CallBack{

    public void callBack(int p) {

        System.out.println(" Метода callBack(), вызываемый со значением " + p);

    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " + "могут определяться и другие члены");
    }
}
