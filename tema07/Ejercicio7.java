/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Ejercicio7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int[] num = new int[100];
    int aleatorio = 0;
    int contador = 0;
    int buscar = 0;
    int sustituir = 0;
    int i = 0;
    Scanner s = new Scanner(System.in);
    for (i = 0; i < 100; i++) {
      aleatorio = (int) (Math.random() * 21) + 0;
      num[i] = aleatorio;

    }
    for (i = 0; i < 100; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println("Por favor introduce el numero a buscar ");
    buscar = s.nextInt();

    System.out.println("Por favor introduce el numero por el que lo quieres sus ");
    sustituir = s.nextInt();
    for (i = 0; i < 100; i++) {
      if (num[i] == buscar) {
        num[i] = sustituir;
        System.out.print("'" + num[i] + "'");
      }
      System.out.print(num[i] + " ");

    }
  }

}
