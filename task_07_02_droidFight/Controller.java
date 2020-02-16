package task_07_02_droidFight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Controller {

    Model m;
    View v;


    public Controller(Model model, View view){
        this.m=model;
        this.v=view;
    }

    public void startGame() throws IOException {
        v.begin();

        v.whatTypeOfDroid1();
        m.initFisrtFighter();

        v.whatTypeOfDroid2();
        m.initSecondFighter();

        m.startFight();
        v.congratulate(m);
    }

}
