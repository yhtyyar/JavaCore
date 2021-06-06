package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.bridge;

public class ProgramCreator {
    public static void main(String[] args) {

        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {

            program.developProgram();
        }
    }
}
