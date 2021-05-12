package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class ConstructorRefDemo {

    public static void main(String [] args) {

        MyFunc3 myClassCons = MyClass :: new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте vc равно " + mc.getVal());
    }
}
