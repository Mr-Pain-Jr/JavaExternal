package task_droidFight.serDeserialization;

import task_droidFight.droids.DroidFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class tst {

    public static void main(String[] args) throws IOException {

        DroidSerializator ds = new DroidSerializator();
        DroidDeserializator dd = new DroidDeserializator();

        DroidFactory df = new DroidFactory();
        ds.saveDroidToFile(df.bakeDroid(1));

        dd.deserialize();
        System.out.println(dd.all.toString());
    }
}
