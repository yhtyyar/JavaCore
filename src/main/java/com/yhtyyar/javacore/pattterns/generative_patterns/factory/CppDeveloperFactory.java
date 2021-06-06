package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.factory;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
