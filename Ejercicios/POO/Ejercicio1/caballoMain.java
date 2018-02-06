/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Ejercicio1;

/**
 *
 * @author manue
 */
public class caballoMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    caballoClass a = new caballoClass("pepe", "negro", 4, 6);

    System.out.println("Hola, me llamo " + a.getNombre());
    a.cabalga();
    a.relincha();
    // TODO code application logic here
  }

}
