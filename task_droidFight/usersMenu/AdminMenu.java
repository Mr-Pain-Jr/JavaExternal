package task_droidFight.usersMenu;

import task_droidFight.Model;
import task_droidFight.droids.Droid;
import task_droidFight.droids.DroidFactory;
import task_droidFight.regAuth.IUser;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMenu extends Model {


    Scanner sc = new Scanner(System.in);
    List<Droid> myDroids = new ArrayList<>();

    public AdminMenu() {
        System.out.println("Nice to meet you, admin !");
    }

    public void choseOption(int i){
        if(i == 1){
            lookOnDroids();
        }else if(i == 2){
            System.out.println("Please choose what droid you want to add.");
            int d = sc.nextInt();
           addDroid(new DroidFactory().bakeDroid(d));
        }else if(i == 3){
            System.out.println("What droid you want to edit? (enter his number in array)");
            int edit = sc.nextInt();
            editDroid(edit);
        }else if (i == 4){
            System.out.println("Enter index of droid you want to delete: ");
            int s = sc.nextInt();
            deleteDroid(s);
        }
    }
    public void lookOnDroids(){
        myDroids.toString();
    }
    public void addDroid(Droid d){
        myDroids.add(d);
    }

    public void deleteDroid(int index){
        myDroids.remove(index);
    }


    public void editDroid (int index){
        Droid d = myDroids.get(index);
        System.out.println("Want to set damage or energy? (D/E)");
        String c = sc.next();

        if(c.equals("D")){
            System.out.println("Enter new damage for "+d.toString()+":");
            int dam = sc.nextInt();
            setDroidDamage(d,dam);
        }else if(c.equals("E")){
            System.out.println("Enter new energy for "+d.toString()+":");
            int en = sc.nextInt();
            setDroidEnergy(d,en);
        }

    }

    public void setDroidEnergy(Droid d, int lvl){
        d.energyLevel=lvl;
    }

    public void setDroidDamage(Droid d, int lvl){
        d.damageLevel = lvl;
    }




}
