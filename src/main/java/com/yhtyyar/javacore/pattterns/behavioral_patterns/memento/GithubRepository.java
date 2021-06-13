package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.memento;

public class GithubRepository {

    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
