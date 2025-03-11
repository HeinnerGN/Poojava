package Controlador;

import Modelo.Cliente;
import Vista.Formulario;

public class Controlador {
    private Cliente cliente;
    private Formulario form;
    
    public Controlador(){
        this.cliente = new Cliente();
        this.form = new Formulario();
    }
    
    public void mostrarmenu(){
        this.form.verMenu_inicial();
    }
}
