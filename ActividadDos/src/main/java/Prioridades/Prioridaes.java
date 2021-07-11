package Prioridades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cassandra
 */
public class Prioridaes {
    
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Gloria");
        Hilo h2 = new Hilo("Maria");
        Hilo h3 = new Hilo("Ernesto");
        
        h3.setPriority(Thread.MAX_PRIORITY);
        h1.setPriority(Thread.MIN_PRIORITY);
        
        h1.start(); //start() metodo para ejecutar hilos
        h2.start();
        h3.start();
        
        
       /* try{
            h1.join();// Nos hace
            h2.join();
            h3.join();
        }catch(InterruptedException ex){
            System.out.println("Error en join" + ex.getMessage());
        }
        
       System.out.println("Hilo 1" + h1.k + ", Hilo 2" + h2.k + ", Hilo 3" + h1.k);
        System.out.println("Program end");*/
        
    }
    
}
