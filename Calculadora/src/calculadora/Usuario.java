package calculadora;
import java.util.Scanner;

public class Usuario {
    
    public static int pedirnumero(String mensaje){
        Scanner dato = new Scanner(System.in);
        System.out.println(mensaje);
        return dato.nextInt();
    }
}
