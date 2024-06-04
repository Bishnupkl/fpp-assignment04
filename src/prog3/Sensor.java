package prog3;

<<<<<<< Updated upstream
=======
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

>>>>>>> Stashed changes
public interface Sensor {

    String getSensorType();

    double getReading();

    String getLocation();

<<<<<<< Updated upstream
    String getLastUpdated();
=======
    default String getLastUpdated(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a"));
    };
>>>>>>> Stashed changes

    String performAction();
}