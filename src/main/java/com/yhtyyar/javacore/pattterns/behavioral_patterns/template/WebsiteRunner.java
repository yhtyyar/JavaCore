package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.template;

public class WebsiteRunner {
    public static void main(String[] args) {

        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n===================================\n");

        newsPage.showPage();
    }
}
