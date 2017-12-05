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
public class Ejercicio6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int [] num = new int[15];
    
    int contador=0;
    Scanner s = new Scanner(System.in);
    do{
      System.out.println("Introduce 15 numeros");
      int n = s.nextInt();
      num[contador]=n;
      contador++;
    }while(contador<15);
  
  for(contador=0;contador<15;contador++){
    System.out.println(num[contador]);
    
  }
  int aux=num[14];
  for(contador=14;contador>0;contador--){
    num[contador]=num[contador-1];
    }
  num[0]=aux;
  for(contador=0;contador<15;contador++){
    System.out.println(num[contador]);
    
  }
  
  
  }
}



  

