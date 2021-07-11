/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sleep;

/**
 *
 * @author indra
 */
public class SleepActivitad {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Gloria");
        Hilo h2 = new Hilo("Maria");
        Hilo h3 = new Hilo("Ernesto");
        
        h1.start(); //start() metodo para ejecutar hilos
        h2.start();
        h3.start();
    }
}
