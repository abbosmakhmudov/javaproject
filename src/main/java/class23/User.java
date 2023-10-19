package class23;

public class User {
    private String name;
    private int age;
    private String userName;
    private String password;

    public User(String name, int age, String userName,String password){
        setAge(age);
        setName(name);
        setUserName(userName);
        setPassword(password);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
