package prog3;

public class LightSensor extends Connector {

    private double lightLevel;

    public LightSensor(String location, double lightLevel) {
        super(location);
        this.lightLevel = lightLevel;
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String performAction() {
        if (lightLevel < 100) {
            return "Alert: Turn on the light";
        } else {
            return "Light is sufficient";
        }
    }
}
