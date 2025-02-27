package ejerciciospoo;


public class Usuario {
    private static String Nombre;
    private static int Asientosreserv;
    
    public Usuario(String Nombre, int Asientosreserv){
        Usuario.Nombre=Nombre;
        Usuario.Asientosreserv = -1;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public int Asientosreserv(){
        return Asientosreserv;
    }
    
    public void reservarAsientos(int Asiento){
        Usuario.Asientosreserv=Asiento;
    }
}
