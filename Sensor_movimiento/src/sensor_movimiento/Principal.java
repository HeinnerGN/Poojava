package sensor_movimiento;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Sensores_movimiento sensor1 = new Sensores_movimiento();
        Sensores_movimiento sensor2 = new Sensores_movimiento();
        Sensores_movimiento sensor3 = new Sensores_movimiento();
        Alarma alarma = new Alarma();

        boolean denoche = true; 
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sistema de Seguridad - Detección de Intrusos");
            System.out.println("1. Activar / Desactivar alarma");
            System.out.println("2. lectura de sensores");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Quieres activar o desactivar la alarma? (activar/desactivar): ");
                    String info = scanner.next().toLowerCase();
                    if (info.equals("activar")) {
                        denoche = true; 
                    } else if (info.equals("desactivar")) {
                        denoche = false;
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                    break;

                case 2:
                    boolean movimientoSensor1 = sensor1.detectarmovi();
                    boolean movimientoSensor2 = sensor2.detectarmovi();
                    boolean movimientoSensor3 = sensor3.detectarmovi();
                    System.out.println("Sensor 1 detecto movimiento: " + movimientoSensor1);
                    System.out.println("Sensor 2 detecto movimiento: " + movimientoSensor2);
                    System.out.println("Sensor 3 detecto movimiento: " + movimientoSensor3);

                    alarma.Control(movimientoSensor1, movimientoSensor2, movimientoSensor3, denoche);
                    break;

                case 3:
                    System.out.println("Sistema apagado");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }
}