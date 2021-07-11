/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indra
 */
public class Hilo1 extends Thread{
    javax.swing.JLabel resultLabel;
    String palabra, direccion, lectura, resultado = "";
    int contador;
    
    public Hilo1(String p, String d, javax.swing.JLabel rl){
    this.palabra = p;
    this.direccion = d;
    this.resultLabel = rl;
    }
    
    @Override
    public void run(){
        
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(direccion));
            while((lectura = buffer.readLine()) != null){
                System.out.println(lectura);
                
                if(lectura.contains(palabra)){
                contador++;
                }
            }
           // System.out.println(" 2Palabra: " + palabra +" encontrada, " + contador);
             resultLabel.setText( " 1 Palabra: " + palabra +" encontrada, " + contador);
        } catch ( IOException ex) {
            Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
