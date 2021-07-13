/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cassandra
 */
public class Control {
    
    //Cajero caja = new Cajero();

    
    private int tope = 0;

    public int getTope() {
        return tope;
    }
    private boolean llena = false;
    private boolean vacia = true;
    

   
    //Zonas de riesgo
    //Proceso insertar a pila
    public synchronized void insertar(int deposito) {
       
        while (llena) {
           
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        tope += deposito;
        vacia = false;
        llena = tope >= 500;
        notifyAll();
       
    }

    public synchronized int retirar(int cantidad) throws Exception {

        while (vacia) {
            //System.out.println("Saldo insuficiente, saldo actual: " + tope);
           // mensaje = "Saldo insuficiente, saldo actual: " + tope;
            
            
            wait();
           
        }

        if (cantidad <= tope) {
            tope -= cantidad;
            //System.out.println("Retiro de " + cantidad + " exitoso, saldo de: " + tope);
            //mensaje = "Retiro de " + cantidad + " exitoso, saldo de: " + tope;
        } else {
            //System.out.println("Saldo insuficiente, saldo actual: " + tope);
            //mensaje = "Saldo insuficiente, saldo actual: " + tope;
        }

        vacia = tope <= 0;
        llena = false;
        notifyAll();

        return tope;
    }

}
