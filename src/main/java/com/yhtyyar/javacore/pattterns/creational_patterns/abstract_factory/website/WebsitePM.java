package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.website;

import main.java.com.yhtyyar.javacore.pattterns.creational_patterns.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
