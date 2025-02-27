package ejerciciospoo;

public class Asientos {
    private int numero;
    private boolean reservado;
    
    public Asientos(int numero){
        this.numero=numero;
        this.reservado=false;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public boolean isReservar(){
        return reservado;
    }
    
    public void Reservar(){
        this.reservado = true;
    }
    
    public void Liberar(){
        this.reservado = false;
    }
}
