/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author indra
 */
public class Cronometro {

    public static void main(String[] args) {

        Segundos seg = new Segundos();
        Minutos min = new Minutos();

        try {

            //for (int i = 1; i < 61; i++) {
                min.start();
                min.sleep(100);

                seg.start();
                seg.sleep(100);
           // }

        } catch (InterruptedException ex) {
            System.out.println("Error en cronometro: " + ex.getMessage());
        }

    }

}
