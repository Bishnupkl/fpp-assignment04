package prog3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Connector implements Sensor {

    protected String location;
    protected String lastUpdated;

    public Connector(String location) {
        this.location = location;
        this.lastUpdated = "";
    }

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return 0;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        if (lastUpdated.isEmpty()) {
            lastUpdated = getCurrentTime();
        }
        return lastUpdated;
    }

    @Override
    public String performAction() {
        return "";
    }

    private String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
        return formatter.format(new Date());
    }
}
