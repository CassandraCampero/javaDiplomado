
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class Salidas extends Thread{
    
    Control control = new Control();
    int cantidad;
    int dormir;
    
    public Salidas(Control c, int can, int dor){
    this.control=c;
    this.cantidad=can;
    this.dormir=dor;
    }
    
    @Override
    public void run(){
    
        try {
            control.bajas(cantidad);
             Thread.sleep((int)(Math.random() * dormir));
        } catch (InterruptedException ex) {
            System.out.println("Error en SALIDAS: " + ex.getMessage());
        }
        
    }
    
}
