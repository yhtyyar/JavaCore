package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.website;

import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
