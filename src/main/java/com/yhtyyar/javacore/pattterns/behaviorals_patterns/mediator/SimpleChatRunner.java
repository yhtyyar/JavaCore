package main.java.com.yhtyyar.javacore.pattterns.behaviorals_patterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.adduserToChat(user1);
        chat.adduserToChat(user2);

        user1.sendMessage("Hello, I am User 1 !");
        admin.sendMessage("Hello, I am admin!!!");
    }
}
