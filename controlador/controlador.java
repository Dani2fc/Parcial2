package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.CuentaCorriente;

public class controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private CuentaCorriente modelo;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public controlador(VentanaPrincipal pVista, CuentaCorriente pModelo)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
            
            if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
            if(comando.equals("Borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
    
            if(comando.equals("Hallar"))
            {
                modelo.setNombreTitular(vista.miPanelEntradaDatos.getTfx());
                modelo.setSaldo(Integer.parseInt(vista.miPanelEntradaDatos.getTfy()));
                modelo.setTotalAPagar(Integer.parseInt(vista.miPanelEntradaDatos.getTfh()));
                modelo.setTotalARetirar(Integer.parseInt(vista.miPanelEntradaDatos.getTfz()));
                modelo.setCuenta(vista.miPanelEntradaDatos.getCuenta());
                vista.miPanelResultados.mostrarResultado(modelo);
            }
        }
}