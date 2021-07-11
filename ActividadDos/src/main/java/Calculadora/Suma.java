/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author indra
 */
public class Suma extends Thread{
    int r,x,y;
    
    public Suma(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void run(){
        r = x+y;
    }
}
