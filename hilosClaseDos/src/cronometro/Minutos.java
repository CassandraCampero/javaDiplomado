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
public class Minutos extends Thread {

    @Override
    public void run() {

        try {
            for (int y = 0; y < 60; y++) {
                for (int i = 0; i < 60; i++) {
                    System.out.print(y + ":");
                    Thread.sleep(1000);
                }
            }

        } catch (InterruptedException ex) {
            System.out.println("Error segundos: " + ex.getMessage());
        }

    }
}
