/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author Cassandra
 */
public class Control {
    
    private char[] pila = null;
    private int tope = 0;
    //private boolean stock = false;
    private  boolean llena = false;
    private boolean vacia = true;
    public Control(int capacidad){
        pila = new char[capacidad];
    }
    
    //Zonas de riesgo
    
    //Proceso insertar a pila
    public synchronized void insertar(char element){
        while(llena){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error: "+ ex.getMessage());
            }
        }
        
        pila[tope++] = element;
       //tope = tope++;
        //stock = (tope>=pila.length) ? true : false ;
       vacia = tope>=pila.length;
       llena = true;
       notifyAll();
    }
    
    public synchronized char enviar() throws Exception{
        
        while(vacia){
            wait();
        }
        
        char element = pila[tope--];
       //stock = (tope<= 0) ? true : false;
       vacia = tope<=0;
       llena = false;
       notifyAll();
        
        return element;
    }
}
