public class User implements  Iprint{
    private String username;
    private String Password;


    public User(String username, String password) {
        this.username = username;
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}
