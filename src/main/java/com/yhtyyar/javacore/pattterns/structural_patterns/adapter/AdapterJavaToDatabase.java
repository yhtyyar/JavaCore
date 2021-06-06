package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{


    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
