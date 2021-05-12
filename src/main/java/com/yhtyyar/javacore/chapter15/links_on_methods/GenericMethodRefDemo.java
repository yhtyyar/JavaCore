package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class GenericMethodRefDemo {

    static <T> int myOp (MyFunc2 <T> f, T [] vals, T v) {

        return f.func(vals,v);
    }

    public static void main(String [] args) {

        Integer [] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5};
        String [] strs = { "One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::<Integer> countMatching,vals,4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching,strs,"Two");
        System.out.println("Массив strs содержит  " + count + " числа два");
    }
}
