package task_droidFight;

import java.io.IOException;


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
