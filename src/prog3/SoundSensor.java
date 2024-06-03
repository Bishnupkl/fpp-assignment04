package prog3;

public class SoundSensor extends Connector {

    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        super(location);
        this.soundLevel = soundLevel;
    }

    @Override
    public double getReading() {
        return soundLevel;
    }

    @Override
    public String performAction() {
        if (soundLevel > 70) {
            return "Alert: Turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }
}
