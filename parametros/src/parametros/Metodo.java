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
public class Metodo extends Thread{
    String nombre;
    int edad;
    
    @Override
    public void run(){
        
        System.out.println(nombre + " "+ edad);
    }
    
    public void datos(String nom, int ed){
        this.nombre = nom;
        this.edad = ed;
    }
}
