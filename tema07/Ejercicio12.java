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
    int fin=0;
    int inicial=0;
    int[] num = new int[10];
    int[] aux = new int[10];
    boolean correcto;
    Scanner s = new Scanner(System.in);
    
    for( i=0;i<10;i++){ 
      System.out.println("Introduce 10 numeros");
      int n=s.nextInt();
      num[i]=n;
    
    }
    
    do{
      correcto =true;
      System.out.println("Dime la posicion inicial");
       inicial=s.nextInt();
      if((inicial<0)||(inicial>9)){
        System.out.println("Datos incorrectos");
        correcto=false;
        
      }
      System.out.println("Dime la posicion al que deseas moverlo");
       fin =s.nextInt();
      if((fin<0)||(fin>9)){
        System.out.println("Datos incorrectos");
        correcto=false;        
      }
      if(inicial>=fin){
        System.out.println("Datos incorrectos");
        correcto=false;
        
      }      
    }while(!correcto);   
    for(i=0;i<10;i++){    
    System.out.print(num[i]+" ");
    }
    for(i=0;i<10;i++){    
      aux[i]=num[i];
    }
      aux[fin]=num[inicial];
      for(i=fin+1;i<10;i++){
        aux[i]=num[i-1];        
      }
      aux[0]=num[9];
      for(i=0;i<inicial;i++){
        aux[i+1]=num[i];        
      }
      
      for(i=0;i<10;i++){
        System.out.print(aux[i]+" ");      
      }
   
    // TODO code application logic here
  }
  
}
