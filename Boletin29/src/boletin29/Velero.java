package boletin29;

public class Velero extends Barco{
    int mastiles;

    
    public Velero(int mastiles, String matricula, int eslora) {
        super.eslora=eslora;
        super.matricula=matricula;
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "El alquiler del velero con matricula "+matricula+" , y con "+mastiles+" mástiles ";
    }

    @Override
    public void precio(int dias){
        int precio= dias*((eslora*10)+mastiles);
        System.out.println(precio +"€");
    }
    
    }
    
    

