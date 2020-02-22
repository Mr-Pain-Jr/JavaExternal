package task_droidFight;


import task_droidFight.regAuth.IUser;
import task_droidFight.regAuth.RegAuth;

import java.io.IOException;

public class TryThisFight {
    public static void main(String[] args) throws IOException {
        Model m = new Model();
        View v = new View();
        RegAuth ra = new RegAuth();

        IUser u = ra.startReqAuth();
        Controller c = new Controller(m,v,u);

        c.startProgram();








    }
}
