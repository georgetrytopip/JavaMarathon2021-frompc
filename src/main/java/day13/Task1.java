package day13;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("GeorgeAkhm");
        User user2 = new User("LizaLuk");
        User user3 = new User("Gaga");


        user1.sendMessage(user2, "Sosi jopa");
        user2.sendMessage(user1, "idi naxyi");

        MessageDatabase.showDialog(user1, user2);

        user1.subscribe(user2);
        boolean a = user1.isSubscribed(user2);
        System.out .println(a);

        user2.subscribe(user1);
        boolean b = user2.isFriend(user1);
        System.out.println(b);

        boolean c = user2.isFriend(user3);
        System.out.println(c);



    }
}
