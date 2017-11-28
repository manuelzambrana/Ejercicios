/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Ejercicio3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int[] num = new int[10];
    int contador=9;
    Scanner s = new Scanner(System.in);
    do{
      System.out.println("Introduce 10 numeros");
      int n=s.nextInt();
      num[contador]=n;
      contador--;
    
    
  }while(contador>=0);
    for(contador=0;contador<10;contador++){
      System.out.println(num[contador]);
      
      
    }
 
    
    // TODO code application logic here
  }
  
}
