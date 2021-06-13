package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.command;

public class DeleteCommand implements Command{

    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
