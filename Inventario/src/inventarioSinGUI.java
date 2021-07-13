/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indra
 */
public class inventarioSinGUI {
    
    public static void main(String[] args) {
        Control c = new Control();
        
        Entradas i = new Entradas(c,5,200);
        Salidas o = new Salidas(c,1,200);
        
        i.start();
        o.start();
    }
    
}
