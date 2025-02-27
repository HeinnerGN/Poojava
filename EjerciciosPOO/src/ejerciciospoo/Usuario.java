package ejerciciospoo;


public class Usuario {
    private static String Nombre;
    private static int Asientosreserva;
    
    public Usuario(String Nombre){
        Usuario.Nombre=Nombre;
        Usuario.Asientosreserva = -1;
    }
    
    public static String getNombre(){
        return Nombre;
    }
    
    public static int Asientosreserva(){
        return Asientosreserva;
    }
    
    public static void reservarAsientos(int Asiento){
        Usuario.Asientosreserva=Asiento;
    }
}
