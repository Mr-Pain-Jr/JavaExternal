package task_07_02_droidFight;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TryThisFight {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);





        try {
            c.startGame();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
