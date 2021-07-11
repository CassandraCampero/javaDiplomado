/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

/**
 *
 * @author indra
 */
public class constructor extends Thread{
    String nombre;
    int edad;
    
    public constructor(String n, int e){
    this.nombre = n;
    this.edad = e;
    }
    
    @Override
    public void run(){
        
        System.out.println(nombre + " - " + edad);
    }
    
}
