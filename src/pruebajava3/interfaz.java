/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import javax.swing.*;
import java.awt.*;
//paso 14 - Importar la clase conexion
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;

/**
 * * Roxana Rojo B
 * Fecha 10 Noviembre
 * Programa: PruebaJava3
 * Responsabilidad: Clase Principal
 * @author LAB03
 */
public class interfaz extends JFrame
{
        JPanel panel;
        JLabel label;
        JTextField text;
        JButton boton;
         JButton boton2;
         
         //paso 15 - Creacion de un objeto tipo conexionBD
         ConexionBD con;
         
        public interfaz()
        {
           panel = new JPanel();
           label = new JLabel();
           text = new JTextField(20);
           boton = new JButton();
           boton2 = new JButton();
           
           this.add(panel);
           panel.add(label);
           panel.add(text);
           panel.add(boton);
           panel.add(boton2);        
           
           label.setText("Base de Datos");
           boton.setText("Conectar");
           boton2.setText("Desconectar");
           panel.setBackground(Color.LIGHT_GRAY);
           //paso 16 - Agregamos escuchadores al boton
           boton.addActionListener(new ActionListener()
           {
                public void actionPerformed(ActionEvent evt)
                {
                   con = new ConexionBD();
                   Connection reg = con.conectar();
                }
           });
            boton2.addActionListener(new ActionListener()
           {
                public void actionPerformed(ActionEvent evt)
                {
                   con. desconectar ();
                   
                }
           });
          
           
               
           }

}

        
       
              

