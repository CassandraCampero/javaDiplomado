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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        constructor c= new constructor("Cassandra", 26);
        Metodo m = new Metodo();
        m.datos("Cass", 27);
        
        c.start();
        m.start();
        
    }
    
}
