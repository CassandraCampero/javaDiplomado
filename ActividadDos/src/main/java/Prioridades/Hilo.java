package Prioridades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class Hilo extends Thread{
    String nombre;
    int k = 0;
    
    public Hilo(String name){
        this.nombre = name;
    }
    
    public void run (){
        System.out.println("nombre del hilo: " + nombre);
       /* try{
        int x = (int) (Math.random()*1000);
        Thread.sleep(x);
            System.out.println("Soy: "+ nombre + "(" + x + ")" );
        }
        catch (Exception ex){
            ex.printStackTrace();
            }
            
        for(int i=0 ;i<4 ;i++){
            k = 5+i;
        }*/
    }
}
