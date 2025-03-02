package sensor_temperatura;

import java.util.Scanner;

public class Sensor_temperatura {
    
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Control control = new Control();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double temperatura = sensor.Temperatura();
            control.Controltemp(temperatura);

            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println("Error.");
            }
            
            System.out.println("Quiere continuar? (si/no): ");
            String info = scanner.next().toLowerCase();
            if (info.equals("no")) {
                System.out.println("Simulacion terminada");
                break;
            }
        }
        scanner.close();
    }
}   

