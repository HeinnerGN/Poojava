package control_luces;

public class Luces {
    private boolean luces;
    
    public Luces(){
        this.luces=false;
    }
    
    public void Encender(boolean denoche, boolean haymovi){
        if (denoche && haymovi){
            this.luces=true;
        }
        else {
            this.luces=false;
        }
    }
    
    public boolean getEstadoluces(){
        return luces;
    }
}
