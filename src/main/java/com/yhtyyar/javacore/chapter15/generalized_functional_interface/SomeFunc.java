package main.java.com.yhtyyar.javacore.chapter15.generalized_functional_interface;

@FunctionalInterface
public interface SomeFunc<T> {

    T func (T t);
}
