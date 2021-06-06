package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.banking;

import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
