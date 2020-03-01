package test;

import org.junit.Test;
import task_droidFight.droidFightExceptions.droidException;
import task_droidFight.droids.*;

import static org.junit.Assert.*;

public class DroidFactoryTest {

    @Test
    public void bakeDroid() {
        DroidFactory df = new DroidFactory();

        BattleDroid b = new BattleDroid();
        RocketDroid r = new RocketDroid();
        NinjaDroid n = new NinjaDroid();
        SamuraiDroid s = new SamuraiDroid();
        droidException d = new droidException();

        assertEquals(b, df.bakeDroid(1));
        assertEquals(r, df.bakeDroid(2));
        assertEquals(n, df.bakeDroid(3));
        assertEquals(s, df.bakeDroid(4));
    }
}