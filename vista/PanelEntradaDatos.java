package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lh;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JTextField tfw;
    private JTextField tfh;
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JComboBox cbedicionLujo;
    private String[] cuenta = {"Cuenta corriente", "Cuenta de ahorros", "Libreta 2022"};

    //---------------
    // Metodos
    // --------------
    public PanelEntradaDatos()
    {

        // crear y agregar etiqueta x
        lx = new JLabel("Nombre del titular: ");
        lx.setBounds(37, 30, 200, 20);
        this.add(lx);

        //crear caja de texto x
        tfx = new JTextField();
        tfx.setBounds(150,30,80,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel("Saldo: ");
        ly.setBounds(100, 70, 120, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField();
        tfy.setBounds(160,70,80,20);
        this.add(tfy);

        lh = new JLabel("Total a pagar: ");
        lh.setBounds(60, 110, 120, 20);
        this.add(lh);

        //crear caja de texto y
        tfh = new JTextField();
        tfh.setBounds(150,110,80,20);
        this.add(tfh);

        // crear y agregar etiqueta y
        lz = new JLabel("Total a retirar: ");
        lz.setBounds(50, 140, 120, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField();
        tfz.setBounds(150,140,80,20);
        this.add(tfz);

        cbedicionLujo = new JComboBox();
        for(int i=0; i<cuenta.length;i++)
        {
            cbedicionLujo.addItem(cuenta[i]);
        }
        cbedicionLujo.setBounds(150,180,150,20);
        this.add(cbedicionLujo);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.YELLOW);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getTfx()
    {
        return tfx.getText();
    }

    public String getTfy()
    {
        return tfy.getText();
    }
    public String getTfz()
    {
        return tfz.getText();
    }
    
    public String getTfh()
    {
        return tfh.getText();
    }

    public String getCuenta()
    {
        return (String) cbedicionLujo.getSelectedItem();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
        tfw.setText("");
        tfh.setText("");
    }
    

}