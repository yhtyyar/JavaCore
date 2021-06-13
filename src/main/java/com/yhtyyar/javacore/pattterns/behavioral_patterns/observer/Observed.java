package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.observer;

public interface Observed {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
