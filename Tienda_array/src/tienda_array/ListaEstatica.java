package tienda_array;

import java.util.Scanner;

public class ListaEstatica {
    private String[] listacliente;
    
    public ListaEstatica(){
        this.listacliente = new String[3];
    }
    
    public void mostrardatos(){
        for (int i=0; i<this.listacliente.length; i++){
        System.out.println("Cliente: " + this.listacliente[i]);
        }
    }
    
    public void mostrarinfo(){
        for (String dato : this.listacliente){
            System.out.println("Cliente: " + dato);
        }
    }
    
    public void tomardatos(){
        for(int i=0; i<this.listacliente.length; i++){
            Scanner ea = new Scanner(System.in);
            System.out.println("Digite el nombre: ");
            this.listacliente[i] = ea.nextLine();
        }
    }
}
