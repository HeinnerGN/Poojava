package aire_acondicionado;

import java.util.Scanner;
import java.util.Random;

public class Temperatura{
    public static Random azar = new Random();
    public static String text = "aire prendido";
    public static String texttwo = "aire apagado";
    public boolean continuar = true;
    private Scanner scanner;
    
    public Temperatura(){
        this.scanner = new Scanner(System.in);
         while (continuar) {
            boolean tempMayor28 = azar.nextBoolean();
            boolean humedadm60 = azar.nextBoolean();
            boolean tempMayor30 = azar.nextBoolean();

            if (tempMayor28 && humedadm60) {
                new Humedad_temp(text);
            } else if (tempMayor30) {
                new Humedad_temp(text);
            } else {
                new Humedad_temp(texttwo);
            }
            System.out.println("Quiere intentar de nuevo? (s/n)");
            char user = scanner.next().toLowerCase().charAt(0);
            if (user == 'n') {
                continuar = false;
            }
         }
    }
}
