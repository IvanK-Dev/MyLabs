package laba17;

import java.util.ArrayList;

public class Store {
    private String name;
    private String url;
    private ArrayList<User> users;
    private User authorizedUser;

    public Store(String name, String url, ArrayList<User> users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public boolean login(String userLogin, String userPassword) {
        for (User user : users) {
            if (user.getLogin().equals(userLogin))
                if (user.getPassword().equals(userPassword)) {
                    authorizedUser = new User(user);
                    return false;
                }
        }
        return true;
    }

    public void getCurrentUserRights() {
        switch (this.authorizedUser.getRole()) {
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
            case ADMINISTRATOR:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case CLIENT:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case ANONYM:
                System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
                break;
        }
    }

    public void logout() {
        this.authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }
}
