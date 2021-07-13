
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
public class Entradas extends Thread{
    Control control = new Control();
    int cantidad;
    int dormir;
    
    public Entradas(Control c, int can, int dor){
    this.control=c;
    this.cantidad=can;
    this.dormir=dor;
    }
    
    @Override
    public void run(){
    
        try {
            control.altas(cantidad);
            Thread.sleep((int)(Math.random() * dormir));
        } catch (InterruptedException ex) {
            Logger.getLogger(Entradas.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
}
