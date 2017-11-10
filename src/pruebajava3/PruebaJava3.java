/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;

import Conexion.interfaz;
import javax.swing.JFrame;

/**
 * Roxana Rojo B
 * Fecha 10 Noviembre
 * Programa: PruebaJava3
 * Responsabilidad: Clase Principal
 *
 * @author LAB03
 */
public class PruebaJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            
    {
        interfaz Conexion = new interfaz();
        interfaz w = new interfaz();
          w.setVisible(true);
          w.setBounds(0, 0, 400, 400);
          w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          Conexion.setTitle("Tercera Evaluacion Sumativa");
          w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
    
}
