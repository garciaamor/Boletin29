package boletin29;

import java.util.ArrayList;

public abstract class Barco {
    String matricula;
    int eslora;
    int potencia;
    
    public abstract void precio(int dias);

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", potencia=" + potencia + '}';
    }
    
   
    }

   
    
    
    
    

