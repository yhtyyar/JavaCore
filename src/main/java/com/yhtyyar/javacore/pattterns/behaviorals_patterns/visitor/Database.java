package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
