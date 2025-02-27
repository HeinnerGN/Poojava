package ejerciciospoo;
import java.util.Scanner;

public class Cine {
    private Asientos[] asientos;
    private int capacidad;

    public Cine(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asientos[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asientos(i + 1);
        }
    }

    public void mostrarAsientos() {
        System.out.println("Asientos disponibles:");
        for (Asientos asiento : asientos) {
            if (!asiento.isReservar()) {
                System.out.print(asiento.getNumero() + " ");
            }
        }
        System.out.println();
    }

    public boolean reservarAsiento(int numeroAsiento, Usuario usuario) {
        if (numeroAsiento < 1 || numeroAsiento > capacidad) {
            System.out.println("El número de asiento es inválido.");
            return false;
        }

        Asientos asiento = asientos[numeroAsiento - 1];
        if (asiento.isReservar()) {
            System.out.println("El asiento " + numeroAsiento + " ya está reservado.");
            return false;
        }

        asiento.Reservar();
        usuario.reservarAsientos(numeroAsiento);
        System.out.println("Reserva exitosa para el asiento " + numeroAsiento);
        return true;
    }

    public boolean hayEspacioDisponible() {
        for (Asientos asiento : asientos) {
            if (!asiento.isReservar()) {
                return true;
            }
        }
        return false;
    }
}
