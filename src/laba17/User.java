package laba17;

public class User {
    private String login;
    private String password;
    private String name;
    private Position role;
    public User(String login, String password, String name, Position role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public User(User user) {
        this.login = user.login;
        this.password = user.password;
        this.name = user.name;
        this.role = user.role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Position getRole() {
        return role;
    }

    enum Position {DIRECTOR, ADMINISTRATOR, MANAGER, CLIENT, ANONYM;}
}
