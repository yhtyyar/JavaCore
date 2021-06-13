package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.prototype;

public class ProjectFactory {

    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
