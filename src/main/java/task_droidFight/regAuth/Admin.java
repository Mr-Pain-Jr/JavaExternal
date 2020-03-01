package task_droidFight.regAuth;

public class Admin extends IUser{


    public Admin(String email, String pass){
        this.email=email;
        this.password=pass;
    }

    @Override
    public String toString() {
        return "admin;"+this.email+";"+this.password;
    }
}
