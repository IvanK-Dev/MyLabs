package laba17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", "111111", "Ivan", User.Position.DIRECTOR);
        User user2 = new User("Piter", "222222", "Piter", User.Position.ADMINISTRATOR);
        User user3 = new User("Vasya", "333333", "Vasya", User.Position.ANONYM);
        User user4 = new User("Sveta", "444444", "Sveta", User.Position.CLIENT);
        User user5 = new User("Nik", "555555", "Nik", User.Position.MANAGER);

        ArrayList<User> users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        Store store=new Store("STORE","URL",users);

    }
}
