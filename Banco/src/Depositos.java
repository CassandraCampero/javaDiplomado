/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class Depositos extends Thread {
    private Control c;
    private int deposito = 0;
    private int dormir;
    
    public Depositos(Control c,int d, int dor){
        this.c = c;
        this.deposito = d;
        this.dormir = dor;
    }
    @Override
    public void run(){
    
         try {
            
             if(deposito <= 500){
             
         
              c.insertar(deposito);
            
             
              Thread.sleep((int)(Math.random() * dormir));
             }else {
                 System.out.println("Limite de cta excedido, saldo actual de $500");
             }
       
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        
    }
    
}
