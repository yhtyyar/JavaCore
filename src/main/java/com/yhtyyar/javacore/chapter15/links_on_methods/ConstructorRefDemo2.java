package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class ConstructorRefDemo2 {

    public static void main(String [] args) {

        MyFunc4<Integer> myClassCons = MyClass2<Integer> ::new;

        MyClass2<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

    }

}
