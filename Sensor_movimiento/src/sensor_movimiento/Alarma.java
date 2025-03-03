package sensor_movimiento;

public class Alarma {
    private boolean alarma = false;
    
    public void Control(boolean sensor1, boolean sensor2, boolean sensor3, boolean denoche){
        int sensoresdetectados = 0;
        if(sensor1) sensoresdetectados++;
        if(sensor2) sensoresdetectados++;
        if(sensor3) sensoresdetectados++;
        
        if (sensoresdetectados>=2 && denoche){
            alarma = true;
        }
        else
            alarma = false;
        
        if (alarma){
            System.out.println("Alarma activada: Intrusos detectados.");
        }
        else
            System.out.println("La alarma no ha detectado nada.");
    } 
}
