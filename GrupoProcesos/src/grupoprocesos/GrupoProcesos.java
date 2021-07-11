/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoprocesos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author indra
 */
public class GrupoProcesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExecutorService proceso = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Runnable h = new Hilo("Ejecución de procesos " + i);
            proceso.execute(h); // Necesita un hilo que lleve el implememts Runnable para poder funcionar
            
            
        }

        proceso.shutdown();//Se inicia en orden indicado cada tarea
        while(!proceso.isTerminated()){ //Nos permite finalizar todas las tareas hasta terminar el proceso
            
        }
        System.out.println("Finalizan Procesos");
    }
    
}
