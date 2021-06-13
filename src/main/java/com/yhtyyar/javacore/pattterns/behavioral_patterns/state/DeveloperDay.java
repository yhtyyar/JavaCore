package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.state;

public class DeveloperDay {
    public static void main(String[] args) {

        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 8; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
