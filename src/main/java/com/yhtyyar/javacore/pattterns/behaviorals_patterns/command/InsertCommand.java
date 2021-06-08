package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.command;


public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
