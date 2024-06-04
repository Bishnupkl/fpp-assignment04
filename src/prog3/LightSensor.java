package prog3;

<<<<<<< Updated upstream
public class LightSensor extends Connector {

    private double lightLevel;

    public LightSensor(String location, double lightLevel) {
        super(location);
        this.lightLevel = lightLevel;
=======
public class LightSensor implements Sensor{

    private double lightLevel;
    private Location location;

    public LightSensor(Location location, double lightLevel) {
        this.lightLevel = lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
>>>>>>> Stashed changes
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
<<<<<<< Updated upstream
=======
    public String getLocation() {
        return location.toString();
    }

    @Override
>>>>>>> Stashed changes
    public String performAction() {
        if (lightLevel < 100) {
            return "Alert: Turn on the light";
        } else {
            return "Light is sufficient";
        }
    }
}
