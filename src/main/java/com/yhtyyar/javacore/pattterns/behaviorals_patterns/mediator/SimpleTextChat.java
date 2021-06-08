package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{

    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void adduserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {

        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
