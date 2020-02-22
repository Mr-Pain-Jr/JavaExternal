package task_droidFight;

import task_droidFight.registrationAuthorization.mainMenu;

import java.io.IOException;

public class TryThisFight {
    public static void main(String[] args) throws IOException {
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
