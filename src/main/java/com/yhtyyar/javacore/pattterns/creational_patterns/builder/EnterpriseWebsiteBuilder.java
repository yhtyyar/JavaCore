package main.java.com.yhtyyar.javacore.pattterns.creational_patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {

        website.setName("Enterprise web site");

    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrice() {

        website.setPrice(10_000);
    }
}
