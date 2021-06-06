package main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory;

import main.java.com.yhtyyar.javacore.pattterns.generative_patterns.abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
