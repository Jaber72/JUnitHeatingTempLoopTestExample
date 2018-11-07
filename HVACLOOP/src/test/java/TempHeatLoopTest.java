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
        boolean success = thl.setTemp(77.0);
        double result = thl.getTemp();
        // Verify
        assertEquals( "Testing Temp Getter/Setter", 77.0, result, 0.1 );
    }

    @Test
    public void setSetpointTest() {

        TempHeatLoop thl = new TempHeatLoop();

        boolean success = thl.setSetPoint(85.0);
        double result = thl.getSetpoint();

        assertEquals( "Testing Setpoint Getter/Setter", 85.0, result, 0.1 );
        assertTrue("This call should return success", success);
    }

    @Test
    public void happyPathCalcValvePosition() {
        double temp = 72.0;
        double setpoint = 65.0;

        TempHeatLoop thl = new TempHeatLoop();

        double result = thl.calcValvePosition(temp, setpoint);
        assertEquals("message", thl.BIAS_VALVE_POSITION - .07, result, 0.009);
    }
}
