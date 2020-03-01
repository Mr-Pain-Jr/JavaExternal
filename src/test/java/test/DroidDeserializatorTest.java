package test;

import org.junit.Test;
import task_droidFight.droidFightExceptions.droidException;
import task_droidFight.droids.Droid;
import task_droidFight.serDeserialization.DroidDeserializator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class DroidDeserializatorTest {

    @Test
    public void deserialize() throws droidException {
        DroidDeserializator dd = null;
        try {
            dd = new DroidDeserializator();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Droid> expected = dd.all;
        List<Droid> actual = null;
        try {
            actual = dd.deserialize();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(expected,actual);
    }
}