package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.template;

public abstract class WebsiteTemplate {

    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
