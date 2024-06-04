package prog3;

<<<<<<< Updated upstream
public class TemperatureSensor extends Connector {

    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        super(location);
        this.temperature = temperature;
=======
public class TemperatureSensor implements Sensor{

    private double temperature;
    private Location location;

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
>>>>>>> Stashed changes
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
<<<<<<< Updated upstream
=======
    public String getLocation() {
        return location.toString();
    }
    public TemperatureSensor(Location location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
>>>>>>> Stashed changes
    public String performAction() {
        if (temperature > 30) {
            return "Alert: Turn on the AC";
        } else if (temperature < 18) {
            return "Alert: Turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }
}
