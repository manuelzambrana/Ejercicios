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
public class Ejercicio12 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int i=0;
    int[] num = new int[10];
    Scanner s = new Scanner(System.in);
    
    for( i=0;i<10;i++){ 
      System.out.println("Introduce 10 numeros");
      int n=s.nextInt();
      num[i]=n;
    
    }
    System.out.println("Dime la posicion inicial");
    int inicial=s.nextInt();
    System.out.println("Dime la posicion al que deseas moverlo");
    int fin =s.nextInt();
    
  
      int aux=num[9];
      for(i=9;i>0;i--){
        if((num[i]<inicial)&&(num[i]>fin)){
          num[i]=num[i-1];
        }
      }
     
    
    
    
    for(i=0;i<10;i++){    
    System.out.print(num[i]+" ");
    }
    // TODO code application logic here
  }
  
}
