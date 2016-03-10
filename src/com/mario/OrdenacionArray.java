package com.mario;
/**
 *
 * @author mmoureperez
 */
public class OrdenacionArray {
    int numElementos=5;
    String [] nomes= new String [numElementos];
    float[]notas=new float[numElementos];
    //hacer dos metos pidiendo nombres y notas.
    
    public void ordenacion(){
            
            for(int i=0;i<numElementos-1;i++){
                for(int j=i+1;j<numElementos;j++){
                    if(notas[i]>notas[j]){
                        float aux=notas[i];
                        notas[i]=notas[j];
                        notas[j]=aux;
                        String auxy=nomes[i];
                        nomes[i]=nomes[j];
                        nomes[j]=auxy;
                    }}}
}}
