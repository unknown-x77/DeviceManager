import java.util.ArrayList;
public class fan {
    private ArrayList<Integer> fans;
    protected int speedSetting;
    protected boolean isOn;
    protected deviceStatus status;

    public fan() {
    }

    protected void setSpeedSetting(int speed) {
        this.speedSetting = speed;
    }

    protected int getSpeedSetting() {
        return this.speedSetting;
    }

    protected void getStatus() {
        if (this.isOn) {
            this.status = deviceStatus.ON;
        } else  {
            this.status = deviceStatus.OFF;
        }
    }

    protected deviceStatus turnOn() {
        isOn = true;
        status = deviceStatus.ON;
        return this.status;
    }

    /**
     * If the fan is unavailable or off, then it will set the STATUS to off
     */
    protected void turnOff() {
        if (this.status == deviceStatus.UNAVAILABLE || this.status == deviceStatus.OFF) {
            isOn = false;
            status = deviceStatus.OFF;
        }
    }

}