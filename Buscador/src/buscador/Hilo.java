/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indra
 */
public class Hilo extends Thread {

    javax.swing.JTextArea textResult;
    String palabra, direccion, lectura;
    int contador;

    public Hilo(String p, String d) {
        this.palabra = p;
        this.direccion = d;
    }

    public Hilo(String p, String d, javax.swing.JTextArea textResult) {
        this.palabra = p;
        this.direccion = d;
        this.textResult = textResult;
    }

    @Override
    public void run() {

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(direccion));
            while ((lectura = buffer.readLine()) != null) {
                //System.out.println(lectura);

                if (lectura.contains(palabra)) {
                    contador++;
                }
            }
            System.out.println("Palabra: " + palabra + " encontrada " + contador + " veces\n");
            if(textResult != null){ textResult.append("Palabra: " + palabra + " encontrada " + contador + " veces\n");}
           

        } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
