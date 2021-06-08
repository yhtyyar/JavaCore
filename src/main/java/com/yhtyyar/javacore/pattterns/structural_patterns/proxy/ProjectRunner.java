package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new ProxyProject("http://www.github.com/");

        project.run();

    }

}
