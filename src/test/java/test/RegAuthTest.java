package test;

import org.junit.Test;
import task_droidFight.droidFightExceptions.userException;
import task_droidFight.regAuth.RegAuth;

import java.io.IOException;

import static org.junit.Assert.*;

public class RegAuthTest {


        RegAuth ra;

    {
        try {
            ra = new RegAuth();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkSecretPass() {

        String actual="somepassword";
        String expected = "111";

        assertEquals(expected,actual);
    }

}