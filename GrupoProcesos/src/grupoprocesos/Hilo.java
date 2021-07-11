/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoprocesos;

/**
 *
 * @author indra
 */
public class Hilo implements Runnable{

    private String mensaje = "";
    
    public Hilo(String m){
    this.mensaje=m;
    }
    @Override
    public void run() {
        
        try{
            
        System.out.println("hilo interno: "+ mensaje);
        dormir();
        
        } catch(InterruptedException ex){ System.out.println("Error en Hilo: "+ ex.getMessage()); }
        
        
    }
    
    public void dormir()throws InterruptedException{
    Thread.sleep(5000);
    }
    
}
