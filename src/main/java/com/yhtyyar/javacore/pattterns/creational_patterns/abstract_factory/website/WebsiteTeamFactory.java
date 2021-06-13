package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.website;

import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.Developer;
import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.ProjectManager;
import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.ProjectTeamFactory;
import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
