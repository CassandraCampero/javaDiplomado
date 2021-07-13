/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class Retiros extends Thread {
    
    private Control pila;
    private int retiro;
    private int dormir;
    String mensaje;
    
    public Retiros(Control c, int r, int d){
    this.pila = c;
    this.retiro = r;
    this.dormir =d;
    }
    
  @Override
  public void run(){
  try{
    
       
      pila.retirar(retiro);
     // mensaje = pila.mensaje;
        
    }catch(Exception e) {System.out.println("Error en: "+ e); }
    }
  }
    

