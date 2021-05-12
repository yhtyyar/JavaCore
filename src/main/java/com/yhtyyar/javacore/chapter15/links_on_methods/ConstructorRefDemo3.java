package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class ConstructorRefDemo3 {

    static <R,T> R myClassFactory(MyFunc5<R,T> cons, T v) {

        return cons.func(v);
    }

    public static void main(String [] args) {

        MyFunc5 <MyClass2 <Double>, Double> myClassCons = MyClass2 ::new;

        MyClass2 <Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc5 <MyClass3, String> myClassCons2 = MyClass3::new;

        MyClass3 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str  в объекте mc2 равно " + mc2.getVal());
    }
}
