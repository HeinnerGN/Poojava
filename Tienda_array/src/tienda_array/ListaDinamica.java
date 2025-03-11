package tienda_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDinamica {
    ArrayList<String> lista = new ArrayList<>();
    
    public ListaDinamica(){
        this.lista = new ArrayList<>();
    }
    
    public void tomardatos(){
        Scanner lol = new Scanner(System.in);
        System.out.println("Digite el nombre makinaaa: ");
        String auxnombre = lol.nextLine();
        this.lista.add(auxnombre);
    }
    
    public void mostrarcliente(){
        for(String dato : this.lista){
            System.out.println("Cliente: " + dato);
        }
    }
}
