package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {

        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
