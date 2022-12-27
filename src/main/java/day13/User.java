package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String username;
    private List<User> subscribtions;

    User(String username) {
        this.username = username;
        this.subscribtions = new ArrayList<>(Arrays.asList());
    } //констуктор

    public String getUsername() {
        return this.username;
    }//геттер имени пользователя

    public List<User> getSubscibtions() {
        return subscribtions;
    } //геттер поля подписок

    public void subscribe(User user) {
        subscribtions.add(user);
    } //подписываем пользователя на пользователя (пользователя на ком вызвали метод на того, которого передали)

    public boolean isSubscribed(User user) {
        for (User i : subscribtions) {
            return i.getUsername().equals(user.getUsername());
        }
        return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(new Message (this, user, text));
    }

    public String toString(){
        return username;
    }












}
