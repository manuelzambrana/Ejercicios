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
public class Ejercicio8 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int[] num = new int[12];

    int contador = 0;
    Scanner s = new Scanner(System.in);
    do {
      System.out.println("Introduce 12 numeros");
      int n = s.nextInt();
      num[contador] = n;
      contador++;
    } while (contador < 12);
    for(contador=0;contador<12;contador++){
      for(int i=0;i<num[contador];i++){
        System.out.print("*");
      }
       System.out.println();
    }
    // TODO code application logic here
  }

}
