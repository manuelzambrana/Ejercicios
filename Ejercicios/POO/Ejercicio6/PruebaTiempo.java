/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author manue
 */
public class PruebaTiempo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   Tiempo t1 = new Tiempo (8,10,10);
   Tiempo t2 = new Tiempo (0,10,10);
   Tiempo t3 = new Tiempo (0,05,01);
   System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
  }
  
}
