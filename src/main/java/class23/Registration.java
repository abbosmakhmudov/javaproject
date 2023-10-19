package class23;

public class Registration {

    private String email;
    private String userName;
    private String password;
    public Registration(){

    }
    public Registration(String email){
        this.email=email;
    }
    public Registration(String email,String userName){
        this.email=email;
        this.userName=userName;
    }
    public Registration(String email,String userName,String password){
        this.email=email;
        this.userName=userName;
        this.password=password;

    }

    public void setEmail(String email){

        if(email.contains("yahoo")){
            this.email=email;
        }else {
            System.out.println("Please enter valid email");
        }

    }
    public void setUserName(String userName){
        if(userName.isEmpty()&&userName.length()<=6){
            System.out.println("Password can not be Empty or less than 6 characters");
        }else {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if(password.isEmpty()&&password.length()<=6){
            System.out.println("Password can not be Empty or less than 6 characters");
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
