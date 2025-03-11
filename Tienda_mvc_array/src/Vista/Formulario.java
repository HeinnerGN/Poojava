package Vista;

import java.util.Scanner;

public class Formulario {
    private String titulo;
    private String color;
    private int numeropreguntas;
    private int numerobotones;
    private Scanner dato;
    
    public Formulario(){
        this.titulo = "Registro de clientes";
        this.color = "blue";
        this.numeropreguntas = 4;
        this.numerobotones = 2;
        this.dato = new Scanner(System.in);
    }
    
    public void verMenu_inicial(){
        int opcion;
        
        do{
            System.out.println("1. Crear cliente");
            System.out.println("2. Modificar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Salir del sistema");
            System.out.println("Seleccione una opcion:");
            opcion = dato.nextInt();
        }
        while (opcion!=4);
        System.out.println("Saliendo del program...");
    }
}
