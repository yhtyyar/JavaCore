package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.website;

import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website....");
    }
}
