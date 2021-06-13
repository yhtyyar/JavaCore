package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.command;

public class SelectCommand implements Command{
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
