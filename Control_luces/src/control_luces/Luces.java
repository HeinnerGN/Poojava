package control_luces;

import java.util.Random;

public class Luces {
    public static Random dato = new Random();
    public static String info = ("Luces encendidas.");
    public static String datazo = ("Luces apagadas.");
    public static String error = ("Error");

    public Luces() {
        boolean continuar = true;
        while (continuar) {
            boolean denoche = dato.nextBoolean();
            boolean movi = dato.nextBoolean();

            if (denoche && movi) {
                System.out.println(info);
            }
            else {
                System.out.println(datazo);
            }
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println(error);
            }
        }
    }
}