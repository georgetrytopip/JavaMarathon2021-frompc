package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(Message m) {
        messages.add(m);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ":" + " " + message.getText());
            }

        }
    }
}


