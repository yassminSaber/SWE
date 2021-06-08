
import java.util.*;


public class User {
    private String name;
    private int id;
    private String email;
    private long phone;
    private String location;
    private String password;
    private ArrayList<User> users;

    public User() {
    }
    public User(String name, int id, String email, long phone, String location, String password, ArrayList<User> users) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.password = password;
        this.users = users;
        users = new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
       
}
