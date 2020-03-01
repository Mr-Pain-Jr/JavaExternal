package task_droidFight.serDeserialization;

import task_droidFight.droids.Droid;
import task_droidFight.droidFightExceptions.droidException;
import task_droidFight.droids.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DroidDeserializator {


    BufferedReader br;
    public List<Droid> all;
    private static Logger log;

    public DroidDeserializator() throws FileNotFoundException {
        this.br = new BufferedReader(new FileReader("C:\\\\Users\\\\Celeritas\\\\IdeaProjects\\\\JavaExternal\\\\Droids.csv"));
        all = new ArrayList<Droid>();
        log = Logger.getLogger(DroidDeserializator.class.getName());
    }

    public List<Droid> deserialize() throws IOException, droidException {
        String str = "";
        List<Droid> droids = new ArrayList<Droid>();
        while ((str = br.readLine()) != null){
            String[] droidData = str.split(";");
            droids.add(createDroid(droidData));
        }
        this.all=droids;
        return droids;
    }

    public Droid createDroid(String[] droidData) throws droidException {

        if(droidData[0].equals("BattleDroid")){
            return new BattleDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("RocketDroid")){
            return new RocketDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("NinjaDroid")){
            return new NinjaDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else if(droidData[0].equals("SamuraiDroid")){
            return new SamuraiDroid(Integer.parseInt(droidData[1]),Integer.parseInt(droidData[2]));
        }else{
            log.log(Level.INFO, "Exception: ", new droidException());
            throw new droidException("File contains unknown droid!");
        }

    }

}
