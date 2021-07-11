/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclasedos;

/**
 *
 * @author Cassandra
 */
public class HilosClaseDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hilo hilo = new Hilo();
        HiloI i = new HiloI();
        HiloH h = new HiloH();

        try {
            h.start();
            h.sleep(100);

            i.start();
            i.sleep(100);

            hilo.start();
            hilo.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println("Error en hilo: " + ex);
        }

        /*i.start();
        try{        
            
            i.sleep(100);
        }catch(InterruptedException ex){
            System.out.println("Error en i: "+ ex);
        }
        
        
         hilo.start();
        try{        
           
            hilo.sleep(100);
        }catch(InterruptedException ex){
            System.out.println("Error en h: "+ ex);
        }*/
    }

}
