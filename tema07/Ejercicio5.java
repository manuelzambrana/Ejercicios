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
public class Ejercicio5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     int[] num = new int[10];
     int i=0;
     int contador=0;
     int minimo=500;
     int maximo=-500;
     Scanner s = new Scanner(System.in);
     
     
     do{
      System.out.println("introduce 10 numeros");      
      int n=s.nextInt();
      num[contador]=n;
      if(num[contador]<minimo){
         minimo=num[contador];
         
       }
       if(num[contador]>maximo){
         maximo=num[contador];
         
       }
      contador++;
     }while(contador<=9);
     for(contador=0;contador<=9;contador++){
       if(num[contador]==minimo){
         System.out.println(num[contador]+" minimo");
         
       }
       if(num[contador]==maximo){
         System.out.println(num[contador]+" maximo");
         
       }else{
         System.out.println(num[contador]);
         
       }
       
       
       
     }  // TODO code application logic here
  }
  
}
