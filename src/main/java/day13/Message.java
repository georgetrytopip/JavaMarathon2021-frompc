package day13;

import java.time.LocalDateTime;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private LocalDateTime date;

    Message (User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = LocalDateTime.now();
    }

    public User getSender(){
        return this.sender;
    }

    public User getReceiver(){
        return this.receiver;
    }

    public String getText(){
        return this.text;
    }

    public LocalDateTime getDate(){
        return this.date;
    }

    public String toString(){
        return "FROM:" + sender +"\nTO:" + receiver + "\nON" + date + "\n" + text;
    }
}
