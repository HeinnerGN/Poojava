package control_luces;

import java.util.Random;

public class Casa {
    private boolean denoche;
    private boolean haymovi;
    
    public Casa(){
        Random dato = new Random();
        denoche = dato.nextBoolean();
        haymovi = dato.nextBoolean();
    }    
    
    
}
