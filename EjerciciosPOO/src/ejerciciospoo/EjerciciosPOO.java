package ejerciciospoo;

import java.util.Scanner;

public class EjerciciosPOO {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        Cine cine = new Cine(10);

        System.out.println("Introduce tu nombre: ");
        String nombre = dato.nextLine();
        Usuario usuario = new Usuario(nombre);
        cine.mostrarAsientos();

        System.out.println("Elige el número de asiento que deseas reservar: ");
        int asiento = dato.nextInt();
        if (cine.reservarAsiento(asiento, usuario)) {
            cine.mostrarAsientos();
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }
        dato.close();
    }
}
