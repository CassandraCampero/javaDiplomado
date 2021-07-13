/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class Control {
    
    boolean vacia = false;
    //int pila[];
    private int stock = 0;

    public int getStock() {
        
        return stock;
    }
    
    
    
    
   public synchronized void altas(int c) throws InterruptedException{
       
       
       while(vacia){
       
       wait();
       }
       
       stock = stock + c;
       
       vacia = stock <= 0;
       System.out.println(c +" producto(s) dado de alta, hay en stock: " + stock);
       notifyAll();
       
       
   }
   public synchronized int bajas(int c) throws InterruptedException{
   
       while(vacia){
           
           wait();
           
          
       }
       if(c<= stock){
            stock = stock - c;
           System.out.println(c + " producto(s) dado de baja, hay en stock: " + stock);
       }
       
       else{
           System.out.println("No hay productos en stock: " + stock);
       wait();
       }
       vacia = stock <= 0;
       notifyAll();
       return stock;
   }
    
    
}
