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
public class Ejercicio4Bidimensional {

  /**
   * @param args the command line arguments
   * @throws java.lang.InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    int[][] num = new int[4][5];
    Scanner s = new Scanner(System.in);

    int fila;

    int columna;

    for (fila = 0; fila < 4; fila++) {

      for (columna = 0; columna < 5; columna++) {

        num[fila][columna] = (int) (Math.random() * 899) + 101;

      }

    }

    int sumaFila;

    for (fila = 0; fila < 4; fila++) {

      sumaFila = 0;

      for (columna = 0; columna < 5; columna++) {

        System.out.printf("%7d   ", num[fila][columna]);
        Thread.sleep(100);

        sumaFila += num[fila][columna];
        Thread.sleep(100);

      }

      System.out.printf("|%7d\n", sumaFila);
      Thread.sleep(100);

    }

    for (columna = 0; columna < 5; columna++) {

      System.out.print("----------");

    }

    System.out.println("-----------");

    int sumaColumna;

    int sumaTotal = 0;

    for (columna = 0; columna < 5; columna++) {

      sumaColumna = 0;

      for (fila = 0; fila < 4; fila++) {

        sumaColumna += num[fila][columna];
        Thread.sleep(100);

      }

      sumaTotal += sumaColumna;
      Thread.sleep(100);

      System.out.printf("%7d   ", sumaColumna);
      Thread.sleep(100);

    }

    System.out.printf("|%7d   ", sumaTotal);
    Thread.sleep(100);
    // TODO code application logic here
  }

}
