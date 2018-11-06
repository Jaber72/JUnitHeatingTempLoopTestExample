package test.java;

import main.java.TempHeatLoop;
import org.junit.Test;
import static org.junit.Assert.*;


public class TempHeatLoopTest {

    @Test
    public void setTempTest() {

        // set up
        TempHeatLoop thl = new TempHeatLoop();


        // exercise
                boolean error = thl.setTemp(77);
        int result = thl.getTemp();
        // Verify
        assertEquals("Testing Temp Getter/Setter", 77, result);
    }

    @Test
    public void setSetpointTest() {

        TempHeatLoop thl = new TempHeatLoop();

        boolean error = thl.setSetPoint(85);
        int result = thl.getSetpoint();

        assertEquals("Testing Setpoint Gettter/Setter", 85, result);
        assertTrue(error);
    }
}
