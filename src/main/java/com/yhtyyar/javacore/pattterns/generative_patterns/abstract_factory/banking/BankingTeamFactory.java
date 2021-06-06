package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.banking;

import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.Developer;
import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.ProjectManager;
import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.ProjectTeamFactory;
import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
