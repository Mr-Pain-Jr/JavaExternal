package task_droidFight.regAuth;

public class User extends IUser {


    public User(String email, String pass){
        this.email=email;
        this.password=pass;
    }


    @Override
    public String toString() {
        return "user;"+this.email+";"+this.password;
    }
}
