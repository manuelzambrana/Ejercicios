/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class GatoArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Gato[] gato = new Gato[4];
    Scanner s = new Scanner(System.in);
    int i;

    System.out.println("Introduzca el dato de los gatos");

    for (i = 0; i < 4; i++) {
      System.out.println("  \nGato nº " + (i + 1));
      System.out.println("Introduza el nombre");
      gato[i].setNombre(s.nextLine());
      System.out.println("Introduzca el sexo");
      gato[i].setSexo(s.nextLine());
      System.out.println("Introduzca la raza");
      gato[i].setRaza(s.nextLine());
    }
    for (i = 0; i < 4; i++) {
      System.out.println("Nombre: " + gato[i].getNombre());

      System.out.println("Color: " + gato[i].getSexo());

      System.out.println("Raza: " + gato[i].getRaza());

    }

  }

}
