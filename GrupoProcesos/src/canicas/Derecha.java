/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canicas;

import java.util.Observable;

/**
 *
 * @author indra
 */
public class Derecha extends Observable implements Runnable{

    int distancia = 240;
    @Override
    public void run() {
        try{
            
            distancia =(int) (Math.random() * distancia);
             

            Thread.sleep(200);
            
       }catch(InterruptedException ex){System.out.println("Error ex: " + ex);}
        this.setChanged();
            this.notifyObservers(distancia);
            this.clearChanged();
            
            distancia = 240;
    }
    
}
