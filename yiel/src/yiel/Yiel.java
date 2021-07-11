/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yiel;

/**
 *
 * @author Cassandra
 */
public class Yiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Hilo1 uno = new Hilo1();
        Hilo2 dos = new Hilo2();
        Hilo3 tres = new Hilo3();
        
        uno.start();
        dos.start();
        tres.start();
        
    }
    
}
