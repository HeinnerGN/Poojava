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
            System.out.println("Sistema de Seguridad - Deteccion de Intrusos");
            System.out.println("1. Activar / Desactivar alarma");
            System.out.println("2. lectura de sensores");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Quieres activar o desactivar la alarma? (activar/desactivar): ");
                    String info = scanner.next().toLowerCase();
                    if (info.equals("activar")){
                        denoche = true; 
                    }
                    else if (info.equals("desactivar")){
                        denoche = false;
                    }
                    else {
                        System.out.println("Opcion no valida.");
                    }
                    break;

                case 2:
                    boolean movimiento1 = sensor1.detectarmovi();
                    boolean movimiento2 = sensor2.detectarmovi();
                    boolean movimiento3 = sensor3.detectarmovi();
                    System.out.println("Sensor 1 detecto movimiento: " + movimiento1);
                    System.out.println("Sensor 2 detecto movimiento: " + movimiento2);
                    System.out.println("Sensor 3 detecto movimiento: " + movimiento3);

                    alarma.Control(movimiento1, movimiento2, movimiento3, denoche);
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