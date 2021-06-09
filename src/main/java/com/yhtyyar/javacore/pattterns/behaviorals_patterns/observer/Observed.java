package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.observer;

public interface Observed {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
