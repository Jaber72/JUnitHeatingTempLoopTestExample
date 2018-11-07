package main.java;

public class TempHeatLoop {

    private double temp;
    private double setpoint;
    private double valveOut;

    public static final double TEMP_MIN = 32.0;
    public static final double TEMP_MAX = 212.0;
    public double BIAS_VALVE_POSITION = 42.0;
    public TempHeatLoop () {
        this.temp = 70.0;
        this.setpoint = 70.0;
    }
/* Getters and Setters
*******************************************************************************************************/

    public boolean setTemp ( double temp) {

        boolean success = false;
        if(temp < TEMP_MAX || temp >= TEMP_MIN) {
            this.temp = temp;
            success = true;
        }
        else {
            success = false;
        }

        return success;
    }

        public boolean setSetPoint ( double setpoint) {

            boolean success = false;
            if(setpoint < TEMP_MAX || temp >= TEMP_MIN) {
                this.setpoint= setpoint;
                success = true;
            }
            else {
                success = false;
            }

            return success;
        }

        public double getTemp () { return temp; }
        public double getSetpoint () { return  setpoint;}

/*Methods
        *********************************************************************************************************/

       public double calcValvePosition (double temp, double setpoint) {
            double valvePosition = BIAS_VALVE_POSITION;

            valvePosition = valvePosition + ((setpoint - temp) / 100.0);

            if( valvePosition<0 )   { valvePosition =0.0; }
            if( valvePosition>100 ) { valvePosition =100.0; }

            return valvePosition;
        }

}
