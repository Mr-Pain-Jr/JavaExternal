package task_07_02_droidFight;


import task_07_02_droidFight.droids.*;

import java.io.IOException;
import java.util.Scanner;

public class Model {



    Scanner sc = new Scanner(System.in);
    Droid fighter1;
    Droid fighter2;
    DroidFactory df = new DroidFactory();

    public Model(){

    }

    public int askChose () throws IOException {
        int i = sc.nextInt();
        return i;
    }



    public void initFisrtFighter() throws IOException {
        this.fighter1 = df.doChose(askChose());
    }

    public void initSecondFighter() throws IOException{
        this.fighter2 = df.doChose(askChose());
    }


    public void startFight(){

        fightBetweenTwoDroids(fighter1,fighter2);

    }


    public void fightBetweenTwoDroids(Droid d1, Droid d2){
        while(giveLoser() == null){
                d1.fight(d2);
                d2.fight(d1);
        }
    }

    public Droid giveLoser(){

        if(fighter1.energyLevel <= 0){
            return fighter1;
        }else if (fighter2.energyLevel<= 0){
            return fighter2;
        }
        return null;

    }

}
