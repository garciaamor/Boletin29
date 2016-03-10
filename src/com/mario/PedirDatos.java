package com.mario;


import javax.swing.JOptionPane;


public class PedirDatos {
    public static String datoString(String dato){
        return (JOptionPane.showInputDialog(dato));
    }
    public static float datosFloat (String dato){
        return(Float.parseFloat(JOptionPane.showInputDialog(dato)));
    }
}
