package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.visitor;

public class Test implements ProjectElement{

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
