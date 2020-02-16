package task_07_02_droidFight;


import task_07_02_droidFight.droids.BattleDroid;
import task_07_02_droidFight.droids.Droid;
import task_07_02_droidFight.droids.NinjaDroid;
import task_07_02_droidFight.droids.RocketDroid;

import java.io.IOException;
import java.util.Scanner;

public class Model {



    Scanner sc = new Scanner(System.in);
    int choise;
    Droid fighter1;
    Droid fighter2;

    public Model(){

    }

    public int askChose () throws IOException {
        int i = sc.nextInt();
        return i;
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

    public void initFisrtFighter() throws IOException {
        this.fighter1 = doChose(askChose());
    }

    public void initSecondFighter() throws IOException{
        this.fighter2 = doChose(askChose());
    }


    public void startFight(){

        fightBetweenTwoDroids(fighter1,fighter2);

    }

    public Droid giveLoser(){

        if(fighter1.energyLevel <= 0){
            return fighter1;
        }else if (fighter2.energyLevel<= 0){
            return fighter2;
        }
        return null;

    }

    public void fightBetweenTwoDroids(Droid d1, Droid d2){
        while(giveLoser() == null){
                d1.fight(d2);
                d2.fight(d1);
        }

    }
}
