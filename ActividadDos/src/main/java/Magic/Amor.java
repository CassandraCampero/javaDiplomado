/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magic;

/**
 *
 * @author indra
 */
public class Amor extends Thread{
    String phrase;
    int opt;
    
    public Amor(){
    }

   
    public void run(){
        opt  = (int) (Math.random()*9);
    switch(opt){
        case 1: phrase = "Amiga date cuenta";
        break;
        
        case 2: phrase = "No te quiere";
        break;
        
        case 3: phrase = "Agua de calzón";
        break;
        
        case 4: phrase = "Solo amigos";
        break;
        
        case 5: phrase = "No seas tóxica";
        break;
        
        case 6: phrase = "Mejor un Sugar daddy";
        break;
        
        case 7: phrase = "Corazón de condominio";
        break;
        
        case 8: phrase = "Eres la capillita";
        break;
        
        case 9: phrase = "Beso de tres";
        break;
        
        case 10: phrase = "Te ama";
        break;
        
       default: phrase = "Amigos con derecho";
        break;
        
    }
    

    }
}
