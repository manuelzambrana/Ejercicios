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
public class Ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] num= new int [10];
    int[] esPrimo= new int [10];
    int[] noEsPrimo= new int [10];
    int cPrimo=0;
    int cNoPrimo=0;
    Scanner s = new Scanner(System.in);
    int i=0;
    int j=0;
    boolean primo=false;
    
    System.out.println("Introduzca 10 numeros");
    for(i=0;i<10;i++){
      num[i]=s.nextInt();
      primo=true;
      for(j=2;j<num[i]-1;j++){
        if(num[i]%j==0){
          primo=false;
        }
        
      }
       if(primo){
        esPrimo[cPrimo]=num[i];
        cPrimo++;
      }else{
         
         noEsPrimo[cNoPrimo]=num[i];
         cNoPrimo++;
      }
    }
   
    
    
    for(i=0;i<cPrimo;i++){
      num[i]=esPrimo[i];
    }
    for(i=cPrimo;i<cPrimo+cNoPrimo;i++){
      num[i]=noEsPrimo[i-cPrimo];
    }
    for(i=0;i<10;i++){
      System.out.print(num[i]);     
    }
    
   
    // TODO code application logic here
  }
  
}
