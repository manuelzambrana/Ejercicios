/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author manue
 */
public class PruebaPizza {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.sirve();
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    p3.sirve();
    p1.sirve();
    p3.sirve();
    System.out.println("pedidas: " + Pizza.getPizzaPedidas());
    System.out.println("servidas: " + Pizza.getPizzaServidas());

    // TODO code application logic here
  }

}
