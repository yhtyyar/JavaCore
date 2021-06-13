package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
