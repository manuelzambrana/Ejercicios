/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import tema9.Ejercicio1;

/**
 *
 * @author manue
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 1000; i++) {
            if (Ejercicio1.esPrimo(i)) {
                System.out.println(i + " ");                
            }
        }
        // TODO code application logic here
    }

}
