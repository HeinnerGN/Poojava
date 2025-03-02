package sensor_temperatura;

import java.util.Random;

public class Sensor {
    
    public double Temperatura() {
        Random random = new Random();
        return 5 + (35 * random.nextDouble());
    }
}