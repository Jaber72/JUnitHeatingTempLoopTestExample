package main.java;

public class TempHeatLoop {

    public int temp;
    public int setpoint;
    public double valveOut;
    public static final int TEMP_MIN = 32;
    public static final int TEMP_MAX = 212;

    public TempHeatLoop () {
        this.temp = 70;
        this.setpoint = 70;
    }

    public boolean setTemp ( int temp) {

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

        public boolean setSetPoint ( int setpoint) {

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

        public int getTemp () { return temp; }
        public int getSetpoint () { return  setpoint;}


}
