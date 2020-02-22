package task_droidFight.serDeserialization;

import task_droidFight.droids.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DroidDeserializator {


    BufferedReader br;
    List<Droid> all;

    public DroidDeserializator() throws FileNotFoundException {
        this.br = new BufferedReader(new FileReader("C:\\\\Users\\\\Celeritas\\\\IdeaProjects\\\\JavaExternal\\\\Droids.csv"));
        all = new ArrayList<>();
    }

    public void deserialize() throws IOException {
        String str = "";
        while ((str = br.readLine()) != null){
            String[] droidData = str.split(";");
            this.all.add(createDroid(droidData));
        }
    }

    public Droid createDroid(String[] droidData){

        if(droidData[0].equals("BattleDroid")){
            return new BattleDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("RocketDroid")){
            return new RocketDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("NinjaDroid")){
            return new NinjaDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("SamuraiDroid")){
            return new SamuraiDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }
        return null;
    }

}
