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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 99999; i++) {
            if (tema9.Ejercicio1.esCapicua(i)) {
                System.out.println(i + " ");              

            }

        }
        // TODO code application logic here
    }

}
