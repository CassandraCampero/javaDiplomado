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
    public static String ruta = "./Resources/diplomadouscador.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hilo h1 = new Hilo("zapatito", ruta);
        Hilo h2 = new Hilo("Bomba", ruta);
        Hilo h3 = new Hilo("Bomba", ruta);
        Hilo h4 = new Hilo("Bomba", ruta);
        Hilo h5 = new Hilo("Bomba", ruta);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

    }

}
