/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

/**
 *
 * @author indra
 */
public class Buscador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hilo h1 = new Hilo("Bomba", "/Users/indra/Desktop/diplomadoSistemasDistribuidos/diplomadouscador.txt");
      
        h1.start();
    }

}
