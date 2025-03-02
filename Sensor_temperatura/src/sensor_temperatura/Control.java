package sensor_temperatura;

public class Control {
    public void Controltemp(double temp) {
        if (temp < 10) {
            System.out.println("Temperatura: " + temp + "°C - Encendiendo el calefactor.");
        }
        else if (temp >= 10 && temp <= 25) {
            System.out.println("Temperatura: " + temp + "°C - Sistema inactivo.");
        }
        else {
            System.out.println("Temperatura: " + temp + "°C - Encendiendo el ventilador.");
        }
    }
}
