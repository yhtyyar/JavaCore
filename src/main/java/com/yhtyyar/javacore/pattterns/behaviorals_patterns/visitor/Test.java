package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.visitor;

public class Test implements ProjectElement{

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
