package tienda;

import java.util.Scanner;
import java.util.Random;

public class Cliente {
    public static Random random = new Random();
    public static int memb = random.nextInt(3) + 1;
    public static int hora=random.nextInt(24)+1;
    private static String mensj;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void procesardatos(){
        if(Cliente.memb==1 && Cliente.hora>=8 && Cliente.hora<=20){
            mensj=("Acesso para el cliente con membresia");
            System.out.println(mensj);
        }
        else if (Cliente.memb==2 && Cliente.hora>=8 && Cliente.hora<=20){
            mensj=("Acesso para cliente empleado");
            System.out.println(mensj);
        }
        else{
            mensj=("El cliente no tiene acceso");
            System.out.println(mensj);
        }
        
        System.out.println("Quiere intentar de nuevo? (s/n):");
        char info = scanner.next().toLowerCase().charAt(0);
        if (info == 's') {
            memb = random.nextInt(3) + 1;
            hora = random.nextInt(24) + 1;
            procesardatos();
        } else {
            System.out.println("Gracias por usar el sistema.");
        }
    }
}
