package task_07_02_droidFight;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Blitzkrieg {

    ArrayList<Droid> droids = new ArrayList<Droid>();
    Scanner sc = new Scanner(System.in);
    int choise;
    Droid fighter1;
    Droid fighter2;

    public Blitzkrieg(){

    }

    public void startGame(){

        System.out.println("Hello there!");

        System.out.println("Please choose your #1 droid (1-Battle Droid, 2-RocketDroid, 3-NinjaDroid) : ");
        choise = sc.nextInt();
        fighter1 = doChose(choise);

        System.out.println("Please choose your #2 droid (1-Battle Droid, 2-RocketDroid, 3-NinjaDroid) : ");
        choise = sc.nextInt();
        fighter2 = doChose(choise);


        fight(fighter1,fighter2);


    }

    public Droid doChose(int choise) {
        if (choise == 1){
                return new BattleDroid();
        }else if(choise == 2){
                return new RocketDroid();
        }else if(choise ==3){
                return new NinjaDroid();

        }
        return null;
    }

    public void fight(Droid d1, Droid d2){
        while(d1.energyLevel > 0 || d2.energyLevel > 0){

            if(d1.energyLevel <= 0){
                System.out.println(d1.toString()+": Oh no, i've been broken :( Congratulations to fighter #2 - "+ d2.toString() );
                break;
            }else if (d2.energyLevel<= 0){
                System.out.println(d2.toString()+": Oh no, i've been broken :( Congratulations to fighter #1 - "+ d1.toString() );
                break;
            }

            try {
                d1.shoot(d2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                d2.shoot(d1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}

