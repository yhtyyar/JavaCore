package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

@FunctionalInterface
public interface MyFunc<T> {

    boolean func(T v1, T v2);
}
