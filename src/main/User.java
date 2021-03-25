package main;

public class User {
    // Static instances
    private static final String username_1 = "NucciDaBoss";
    private static final String password_1 = "Gamer";
    private static final String username_2 = "HunterThatGuy";
    private static final String password_2 = "notagamer";

    // Instance variables
    private final String current_password;
    private final String current_user;

    public User(String username, String password) {
        this.current_user = username;
        this.current_password = password;
    }

    public String getCurrent_password() {
        return current_password;
    }

    public String getCurrent_user() {
        return current_user;
    }

    public boolean checkUserCredentials(){
        return getCurrent_user().equals(username_1) && getCurrent_password().equals(password_1) ||
                getCurrent_user().equals(username_2) && getCurrent_password().equals(password_2);
    }

}
