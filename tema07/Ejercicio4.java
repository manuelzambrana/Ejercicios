/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

/**
 *
 * @author manue
 */
public class Ejercicio4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int i;
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    for( i=0;i<20;i++){     
      num[i]=(int)(Math.random()*100)+1;
      cuadrado[i]=num[i]*num[i];
      cubo[i]=num[i]*num[i]*num[i];
    }
    for(i=0;i<20;i++){
    
    System.out.println(num[i]);
    System.out.println(cuadrado[i]);
    System.out.println(cubo[i]);
    }
    // TODO code application logic here
  }
  
}
