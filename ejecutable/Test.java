package ejecutable;

import javax.swing.JOptionPane;

import controlador.controlador;
import modelo.CuentaCorriente;
import modelo.CuentaDeAhorro;
import modelo.Libreta2022;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       CuentaCorriente miModelo = new CuentaCorriente();  
       controlador miControlador = new controlador(miVentana,miModelo);
    }
}
