package task_droidFight;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class View {

    ResourceBundle rb = ResourceBundle.getBundle("resource");

    public void begin() throws UnsupportedEncodingException {
        System.out.println(rb.getString("hello"));
    }


    public void whatTypeOfDroid1(){
        System.out.println(rb.getString("choseFighter1"));
    }

    public void whatTypeOfDroid2(){
        System.out.println(rb.getString("choseFighter2"));
    }


    public void congratulate(Model m){
        if(m.giveLoser() == m.fighter1){
            System.out.println(rb.getString("winner2")+m.fighter2.toString()+"!");
            System.out.println(rb.getString("result")+m.fighter2.energyLevel+"!");
        }else if (m.giveLoser() == m.fighter2){
            System.out.println(rb.getString("winner1")+m.fighter1.toString()+"!");
            System.out.println(rb.getString("result")+m.fighter1.energyLevel+"!");
        }
    }

    public void whatAdminWant(){
        System.out.println("What do you want to do? (1 - look on all droids, 2 - add droid, 3 - edit droid (need index in array), 4 - delete droid ");
    }





}
