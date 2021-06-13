package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.interpreter;

public class TerminalExpression implements Expression{
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if (context.contains(data)) {
            return true;
        } else {
            return false;
        }
    }
}
