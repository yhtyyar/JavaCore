package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {

        Project master = new Project(1, "Super Project",
                "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println("\n==========================================\n");
        System.out.println(masterClone);
    }
}
