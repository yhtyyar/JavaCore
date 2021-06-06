package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.bridge;


public abstract class Program {

    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
