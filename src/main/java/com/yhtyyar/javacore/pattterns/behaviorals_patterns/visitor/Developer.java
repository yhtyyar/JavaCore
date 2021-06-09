package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.visitor;



public interface Developer {

    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
