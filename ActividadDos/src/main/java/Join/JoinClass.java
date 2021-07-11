/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Join;

/**
 *
 * @author indra
 */
public class JoinClass {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Gloria");
        Hilo h2 = new Hilo("Maria");
        Hilo h3 = new Hilo("Ernesto");
        
        h1.start();
        h2.start();
        h3.start();
        
        try{
            h1.join();
            h2.join();
            h3.join();
        }catch(InterruptedException ex){ 
            System.out.println("Error"+ ex);}
        
    }
}
