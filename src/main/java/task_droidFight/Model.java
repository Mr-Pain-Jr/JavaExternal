package task_droidFight;


import task_droidFight.droids.Droid;
import task_droidFight.droids.*;

import java.io.IOException;
import java.util.Scanner;

public class Model {



    Scanner sc = new Scanner(System.in);

    public Droid getFighter1() {
        return fighter1;
    }

    public void setFighter1(Droid fighter1) {
        this.fighter1 = fighter1;
    }

    public Droid getFighter2() {
        return fighter2;
    }

    public void setFighter2(Droid fighter2) {
        this.fighter2 = fighter2;
    }

    public DroidFactory getDf() {
        return df;
    }

    public void setDf(DroidFactory df) {
        this.df = df;
    }

    private Droid fighter1;
    private Droid fighter2;
    private DroidFactory df = new DroidFactory();

    public Model(){

    }

    public int askChose () throws IOException {
        int i = sc.nextInt();
        return i;
    }



    public void initFisrtFighter() throws IOException {
        this.fighter1 = df.bakeDroid(askChose());
    }

    public void initSecondFighter() throws IOException{
        this.fighter2 = df.bakeDroid(askChose());
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
