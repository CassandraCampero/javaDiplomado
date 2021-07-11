/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class ActivityDeclaration {
    public static void main(String[] args) {
         
         Thread t = new Thread(new Hilo()); //multihilos
         Runnable r = new Hilo(); //Implements Runnable
         Hilo h = new Hilo(); //Extends Thread
         
         t.start();
         r.run();
         h.run();
    }
}
