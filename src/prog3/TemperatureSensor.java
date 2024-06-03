package prog3;

public class TemperatureSensor extends Connector {

    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        super(location);
        this.temperature = temperature;
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
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
