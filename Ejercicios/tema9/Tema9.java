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
public class Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //voltear
        System.out.println("el 4567 volteado es " + tema9.Ejercicio1.voltea(3434));
        //capicua
        if (tema9.Ejercicio1.esCapicua(29)) {
            System.out.println("el 29 es capicua");
        }

        if (tema9.Ejercicio1.esCapicua(767)) {
            System.out.println("el 767 es capicua");
        }
        //primo
        if (tema9.Ejercicio1.esPrimo(29)) {

            System.out.println("El 29 es primo");
        }

        if (tema9.Ejercicio1.esPrimo(80)) {
            System.out.println("El 80 es primo");
        }

        // TODO code application logic here
    }

}
