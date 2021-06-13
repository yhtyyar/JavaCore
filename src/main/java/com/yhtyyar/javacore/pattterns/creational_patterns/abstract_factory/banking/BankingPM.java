package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.banking;

import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {

        System.out.println("Banking PM manages banking project...");
    }
}
