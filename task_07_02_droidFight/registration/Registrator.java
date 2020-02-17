package task_07_02_droidFight.registration;
import java.io.*;
import java.util.Scanner;


public class Registrator {

        File file;
        FileWriter fw;
        Scanner sc = new Scanner(System.in);

    public Registrator() throws IOException {
        file = new File("usersData.txt");
        fw = new FileWriter(file);
    }

    public void createUserDataFile() throws IOException {
        file.createNewFile();
    }

    public boolean isEmailCorrect(String email){
        if(email.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$")){
            return true;
        }else{
            return false;
        }

    }

    public String askEmail(){
        System.out.println("Enter your email, please: ");
        String email = sc.next();

        if(isEmailCorrect(email)){
            return email;
        }else{
            System.out.println("Your e-mail must be in correct form! (for example: myemail@gmail.com)");
            askEmail();
        }

        return email;
    }

    public String askPssword(){
        System.out.println("Enter your password,please: ");
        String pass = sc.next();

        return pass;
    }

    public void fillBlanks() throws IOException {
            String email = askEmail();
            String pass = askPssword();
                fw.write(email+";"+pass+"."+"\n");
                fw.flush();
    }




    public static void main(String[] args) throws IOException {
        Registrator r = new Registrator();
        r.createUserDataFile();
        r.fillBlanks();
    }



}
