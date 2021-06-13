package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.builder;

public abstract class WebsiteBuilder {

    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
