package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin29 {

    public static void main(String[] args) {
        
        int pyate=0, pdeportiva=0, pvelero=0;
        ArrayList<Barco> arrayBarcos=new ArrayList();
        
        Barco velero=new Velero(5,"AAA",6);
        Barco deportiva=new Deportiva(30,"BBB",5);
        Barco yate=new Yate(30,30,"CCC",30);
        
        arrayBarcos.add(velero);
        arrayBarcos.add(deportiva);
        arrayBarcos.add(yate);
        
        System.out.println(velero.toString());
        
        velero.precio(pvelero);
        
        System.out.println(deportiva.toString());
        deportiva.precio(pdeportiva);
        
        System.out.println(yate.toString());
        yate.precio(pyate);
        
    }
    
}
