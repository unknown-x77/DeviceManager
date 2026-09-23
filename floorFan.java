public class floorFan extends fan {
    protected boolean isOscillating;
    protected int timer;

    public floorFan() {
    }

    protected void setOscillation(boolean isOscillating) {
        this.isOscillating = isOscillating;
    }

    protected boolean getOscillation() {
        return this.isOscillating;
    }

    protected void setTimer(int timer) {
        this.timer = timer;
    }

    protected int getTimer() {
        return this.timer;
    }
}