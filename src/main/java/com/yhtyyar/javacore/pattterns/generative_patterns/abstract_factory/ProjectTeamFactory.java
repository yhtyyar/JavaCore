package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
