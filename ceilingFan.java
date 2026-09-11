public class ceilingFan extends fan {
    protected boolean isLightOn;
    protected double lightSetting; // 0 = off | .5 = dim | 1 = bright
    protected boolean isclockwise; // summer = counterclockwise | winter = clockwise

    public ceilingFan(int speedSetting, boolean isOn, boolean isLightOn, boolean isclockwise) {
        super(speedSetting, isOn);
        this.isLightOn = isLightOn;
        this.isclockwise = isclockwise;
    }

    protected void setLight(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    protected boolean getLight() {
        return this.isLightOn;
    }

    protected void setLightSetting(double lightSetting) {
        this.lightSetting = lightSetting;
    }

    protected double getLightSetting() {
        return this.lightSetting;
    }

    protected void setDirection(boolean isclockwise) {
        this.isclockwise = isclockwise;
    }

    protected boolean getDirection() {
        return this.isclockwise;
    }
}