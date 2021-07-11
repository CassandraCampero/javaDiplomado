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
public class Trabajo extends Thread{
    String phrase;
    int opt;
    
    public Trabajo(){
    }
    public void run(){
    opt  = (int) (Math.random()*9);
    switch(opt){
        case 1: phrase = "¡Contratado!";
        break;
        
        case 2: phrase = "Nosotros te llamamos";
        break;
        
        case 3: phrase = "¿Nivel Inglés?";
        break;
        
        case 4: phrase = "Work for it";
        break;
        
        case 5: phrase = "Haz lo que amas";
        break;
        
        case 6: phrase = "Se de mente abierta";
        break;
        
        case 7: phrase = "¿Terminaste los deberes?";
        break;
        
        case 8: phrase = "Tienes mil posibilidades";
        break;
        
        case 9: phrase = "El tiempo es dinero";
        break;
        
        case 10: phrase = "Otro día, otro dollar";
        break;
        
        default: phrase = "Ponte la camiseta";
        break;
        
    }
        
    }
}
