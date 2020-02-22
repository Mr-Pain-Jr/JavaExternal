package task_droidFight;

import task_droidFight.regAuth.Admin;
import task_droidFight.regAuth.IUser;
import task_droidFight.regAuth.User;
import task_droidFight.usersMenu.AdminMenu;
import task_droidFight.usersMenu.UserMenu;

import java.io.IOException;


public class Controller {

    Model m;
    View v;

    IUser u;

    public Controller(Model model, View view, IUser u) {
        this.m = model;
        this.v = view;
        this.u = u;
    }

    public void startProgram() throws IOException {
        if(u.getClass() == Admin.class){
            AdminMenu am = new AdminMenu();
            v.whatAdminWant();
            int adm = m.askChose();
            am.choseOption(adm);

        }else if (u.getClass() == User.class){
            UserMenu um = new UserMenu();
            setFighter1();
            setFighter2();
            fight();
        }
    }


    public void setFighter1() throws IOException {
        v.whatTypeOfDroid1();
        m.initFisrtFighter();
    }

    public void setFighter2() throws IOException {
        v.whatTypeOfDroid2();
        m.initSecondFighter();
    }

    public void fight() throws IOException {
        v.begin();

        setFighter1();

        setFighter2();

        m.startFight();
        v.congratulate(m);
    }



}
