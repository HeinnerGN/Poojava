package tienda_array;

public class Tienda_array {

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        lista.mostrardatos();
        lista.tomardatos();
        lista.mostrarinfo();
        
        ListaDinamica dina = new ListaDinamica();
        dina.tomardatos();
        dina.mostrarcliente();
    }
    
}
