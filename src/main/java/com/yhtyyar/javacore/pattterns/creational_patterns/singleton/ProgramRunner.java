package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.singleton;

public class ProgramRunner {

    public static void main(String[] args) {

        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();

    }
}
