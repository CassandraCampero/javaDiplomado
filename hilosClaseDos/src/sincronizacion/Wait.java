/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author indra
 */
public class Wait {
    public static void main(String[] args) {
        
        int tam = 6;
        //int dormir = 0;
        Control controlador = new Control(tam);
        Produccion prod = new Produccion(controlador, tam,  2000);
        Outputs salidas = new Outputs(controlador, tam,  4000);
        
        prod.start();
        salidas.start();
    }
}
