package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import modelo.CuentaCorriente;

public class PanelResultados extends JPanel
{
        //---------------
    // Atributos
    // --------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
   
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelResultados()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.RED);

        //Crear y agregar area de texto 
        taResultado= new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,380,200);
        this.add(spResultado);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);

    }
    // metodo de acceso a la informacion
    public void mostrarResultado(CuentaCorriente p)
    {
        taResultado.setText(p.toString());
    }

    // borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }  
    
}