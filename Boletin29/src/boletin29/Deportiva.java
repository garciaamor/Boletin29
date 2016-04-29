package boletin29;

public class Deportiva extends Barco{
    

    public Deportiva(int potencia, String matricula, int eslora) {
        super.eslora= eslora;
        super.matricula=matricula;
        super.potencia = potencia;
    }

    @Override
    public String toString() {
        return "El alquiler de la embarcacion deportiva con matricula "+matricula+" , y con "+potencia+" CV de potencia ";
    }

    
    @Override
    public void precio(int dias) {
        int precio= dias*((eslora*10)+potencia);
        System.out.println(precio+"€");
    
    
}
}
