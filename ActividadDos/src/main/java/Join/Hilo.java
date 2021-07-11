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
public class Hilo extends Thread{
    String name;
    public Hilo(String name){
    this.name = name;
    }
    
    public void run(){
        
        try{
        int x = (int) (Math.random()*1000);
        Thread.sleep(x);
            System.out.println("Soy: "+ name + "(" + x + ")" );
        }
        catch (Exception ex){
            ex.printStackTrace();
            }
       
    }
}
