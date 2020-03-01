package task_droidFight.regAuth;

import task_droidFight.droidFightExceptions.userException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegAuth {

    File file;
    FileWriter fw;
    BufferedReader br;
    Scanner sc = new Scanner(System.in);
    List<IUser> all = new ArrayList<IUser>();

    public RegAuth() throws IOException {
        file = new File("usersData.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        fw = new FileWriter(file,true);
        br = new BufferedReader(new FileReader("C:\\\\Users\\\\Celeritas\\\\IdeaProjects\\\\JavaExternal\\\\usersData.txt"));
    }



    public IUser startReqAuth() throws IOException, userException {
        System.out.println("Do you want to register or authorize? (type R/A)");
        String s = sc.next();

        if(s.equals("R")){
            regUser(fillBlanks());
            return startReqAuth();
        }else if(s.equals("A")){
            loadUserFromFile();
            return passwordVerification(lookForEmail());
        }else{
            System.out.println("You must choose R/A !");
            return startReqAuth();
        }
    }


    public boolean isEmailCorrect(String email){
        if(email.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$")){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPassCorrect(String pass) throws userException {
        if(pass.matches("^[a-z0-9_-]{6,21}$")){
            return true;
        }else {
            throw new userException("Password must be in correct form!");
        }
    }

    public String askEmail(){
        System.out.println("Enter your email, please: ");
        String email = sc.next();

        if(isEmailCorrect(email)){
            return email;
        }else{
            System.out.println("Your e-mail must be in correct form! (for example: myemail@gmail.com)");
        }

        return askEmail();
    }

    public String askPssword() throws userException {
        System.out.println("Enter your password, please: ");
        String pass = sc.next();

        if(isPassCorrect(pass)){
            return pass;
        }else{
            System.out.println("Your password must be between 6 and 21 characters, contain at least 1 number and 1 letter!");
        }
        return askPssword();
    }

    public boolean secretPass(String pass){
        if ("111".equals(pass)) {
            return true;
        }
        return false;
    }

    public boolean checkSecretPass(){
        System.out.println("Enter the secret password, please: ");
        String pass = sc.next();
        if(secretPass(pass)==true){
            return true;
        }else if (secretPass(pass)==false){
            System.out.println("Wrong answer!");
            checkSecretPass();
        }

        return true;
    }

    public boolean askRole(){
        System.out.println("Do you want to register as an Admin or User? (type A or U)");
        String role = sc.next();

        if(role.equals("U")) {
            return false;
        }else if(role.equals("A")){
            return checkSecretPass();
        }else{
            System.out.println("You must choose between A or U!");
        }
        return askRole();
    }

    public IUser fillBlanks() throws IOException, userException {
        String email = askEmail();
        String pass = askPssword();
        boolean whoAreYou = askRole();

        if(whoAreYou==true){
            System.out.println("Successfully created Admin!");
            return new Admin(email,pass);
        }else{
            System.out.println("Successfully created User!");
            return new User(email,pass);
        }

    }

    public void regUser(IUser user) throws IOException, userException {
        fw.write(user.toString()+"\n");
        fw.flush();
        fw.close();
        startReqAuth();
    }


    public IUser createUser(String[] userFromFile){
        String whoAreYou = userFromFile[0];
        if(whoAreYou.equals("admin")) {
            return new Admin(userFromFile[1],userFromFile[2]);
        }else if(whoAreYou.equals("user")){
            return new User(userFromFile[1],userFromFile[2]);
        }

        return null;
    }

    public void loadUserFromFile() throws IOException {
        String str = "";
        while ((str = br.readLine()) != null){

            String[] userData = str.split(";");
            this.all.add(createUser(userData));
        }
    }

    public int lookForEmail() {
        System.out.println("Enter your e-mail, pls");
        String email = sc.next();
        for (IUser u :all) {
            if(u.email.equals(email)){
                return all.indexOf(u);
            }
        }
        return lookForEmail();
    }

    public IUser passwordVerification(int userIndex){
        System.out.println("Enter password for the "+all.get(userIndex).email+":");
        String pass = sc.next();
        if(pass.equals(all.get(userIndex).password)){
            System.out.println("Logged in successfully!");
            return all.get(userIndex);
        }else{
            System.out.println("Wrong password for the "+all.get(userIndex).email+"!");
        }
        return passwordVerification(userIndex);
    }

}
