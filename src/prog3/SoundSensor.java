package prog3;

<<<<<<< Updated upstream
public class SoundSensor extends Connector {

    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        super(location);
        this.soundLevel = soundLevel;
=======
public class SoundSensor implements Sensor {

    private Location location;
    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
>>>>>>> Stashed changes
    }

    @Override
    public double getReading() {
        return soundLevel;
    }

    @Override
<<<<<<< Updated upstream
=======
    public String getLocation() {
        return this.location.toString();
    }

    private double soundLevel;

    public SoundSensor(Location location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
    }
    @Override
>>>>>>> Stashed changes
    public String performAction() {
        if (soundLevel > 70) {
            return "Alert: Turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }
}
