package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.visitor;



public interface Developer {

    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
