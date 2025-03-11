package Modelo;

public class Cliente {
    private String nombrecliente;
    private String cedula;
    
    public Cliente(){
        this.nombrecliente="";
        this.cedula="";
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
