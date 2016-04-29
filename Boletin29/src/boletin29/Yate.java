package boletin29;

public class Yate extends Barco{
    
    int camarotes;

    public Yate(int potencia, int camarotes, String matricula, int eslora) {
        super.eslora=eslora;
        super.matricula=matricula;
        super.potencia=potencia;
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "El alquiler del yate con matricula "+matricula+" , y con "+potencia+" CV de potencia ";
    }

   
 @Override
    public void precio(int dias) {
        int precio= dias*((eslora*10)+camarotes+potencia);
        System.out.println(precio+"€");
    }
   
    
    
}
