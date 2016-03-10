package com.mario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mmoureperez
 */
public class Ficheros {
     public void lerFich(String nomeFich) {
         String res="";
        Scanner sc =null;
        try {// Scanner ten excepcion por se nn se encotra o ficheiro por iso hay que faer un atry catch

            File f = new File(nomeFich); // creamos a clase File.

            sc = new Scanner(f); //crear o fluxo entre ficheiro e programa.
            //tamen: sc = new Scanner(new File(nomeFich));
            
            while(sc.hasNextLine()){
                
                res=res+sc.nextLine()+"\n";//leera a linea seguinte
                
                
                //tamen se pode poñer system.out.println(sc.nextLine());
            }System.out.println(res);

        } catch (FileNotFoundException ex) {
            System.out.println("Erro1 " + ex.toString());
        } finally {
            sc.close();
        }
             
        }
     
     public void lerDatoFicheiro(String nomFich){
    Scanner ler=null;
        try {
            ler = new Scanner(new File(nomFich)).useDelimiter("\\s*,\\s*");//calquera sentenza de escape estandar como un espacio un \n lo salta sin contar los espacios.
            while(ler.hasNext()){
                System.out.println("*** "+ ler.next());// leera o dato seguinte
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro2 "+ ex.getMessage());
            
        
   } finally{
        if(ler != null)
            ler.close();
        }
    }
     
     public void engadir(String nomeFich, String dato) {
        FileWriter fw = null;
        PrintWriter esc = null;
        try {
            fw = new FileWriter(nomeFich, true);
            esc = new PrintWriter(fw);
            esc.append("\n");
            esc.append(dato);

        } catch (IOException ex) {
            System.out.println("erro engadir" + ex.getMessage());
        } finally {

            try {
                fw.close();
                esc.close();
            } catch (IOException ex) {
                System.out.println("erro de pechado");
            }

        }
    }
     
     public void escribir(String nomeFich){
        File f = new File(nomeFich);
        PrintWriter escribir=null;
        try {
            // Abrimos ficheiro para escribir.
             escribir= new PrintWriter(f);
             for(int i=0;i<4;i++){
             escribir.println(i);
             }
        } catch (FileNotFoundException ex) {
            System.out.println("erro escritura"+ex.getMessage());
        }finally{
            escribir.close();
        }
    }
    
}
