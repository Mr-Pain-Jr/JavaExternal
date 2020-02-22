package task_droidFight.serDeserialization;

import task_droidFight.droids.Droid;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DroidSerializator {

    FileWriter fw;
    File f;
    List<Droid> droids;

    public DroidSerializator() throws IOException {
        this.f = new File("Droids.csv");
        if(!f.exists()){
            f.createNewFile();
        }
        this.fw = new FileWriter(f, true);
    }


    public void saveDroidToFile(Droid d) throws IOException {
        fw.write(d.save()+"\n");
        fw.flush();
        fw.close();
    }

    public void saveListToFile(List<Droid> dr ) throws IOException {
        for (Droid d:dr) {
            fw.write(d.save()+"\n");
            fw.flush();
            fw.close();
        }
    }


}
