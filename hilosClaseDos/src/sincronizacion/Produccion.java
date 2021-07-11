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
public class Produccion extends Thread {

    private Control pila;
    private int cantidad;
    private int dormir;
    
    public Produccion(Control p, int c, int d) {
        this.pila = p;
        this.cantidad = c;
        this.dormir = d;
    }
    
    @Override
    public void run() {
        
        try {
            
            char element;
            for (int i = 0; i < cantidad; i++) {
                element = (char) ('a'+ i);
                pila.insertar(element);
                System.out.println("Producción: " + element);
                Thread.sleep((int)(Math.random() * dormir)); //Casting para convertir el resultao del ramdom a int
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
