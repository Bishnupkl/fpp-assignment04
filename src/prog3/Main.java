package prog3;

public class Main {

    public static void main(String[] args) {

            Sensor[] sensors = new Sensor[5];
            sensors[0] = new LightSensor("Living Room", 80);
            sensors[1] = new SoundSensor("Kitchen", 65);
            sensors[2] = new TemperatureSensor("Bathroom", 25);
            sensors[3] = new LightSensor("Garden", 120);
            sensors[4] = new SoundSensor("Bedroom", 82);

            for (Sensor sensor : sensors) {
                System.out.println("Sensor Type: " + sensor.getSensorType());
                System.out.println("Reading: " + sensor.getReading());
                System.out.println("Location: " + sensor.getLocation());
                System.out.println("Last Updated: " + sensor.getLastUpdated());
                System.out.println("Action: " + sensor.performAction());
                System.out.println();
            }
        }
    }
