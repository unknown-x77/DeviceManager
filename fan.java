import java.util.ArrayList;
public class fan {
    private ArrayList<Integer> fans;
    protected int speedSetting;
    protected boolean isOn;
    protected deviceStatus status;

    public fan(int speedSetting, boolean isOn, deviceStatus status) {
        fans = new ArrayList<Integer>();
        this.speedSetting = speedSetting;
        this.isOn = isOn;
        this.status = status;
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

    protected void turnOff() {
        if (this.status == deviceStatus.UNAVAILABLE || this.status == deviceStatus.OFF) {
            isOn = false;
            status = deviceStatus.OFF;
        }
    }

}