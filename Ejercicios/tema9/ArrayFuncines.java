/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;


/**
 *
 * @author manue
 */
public class ArrayFuncines {
  
  public static void muestraArray(int x[]){
    for(int i=0;i<x.length;i++){
      System.out.print(x[i]+" ");      
    }
    System.out.println();    
  }
  
  public static int minimoArrayInt(int x[]){
    int minimo=MAX_VALUE;
    for(int i=0;i<x.length;i++){
      if(x[i]<minimo){
        minimo=x[i];
      }      
    }
    return minimo;
  }
  public static int maximoArrayInt(int x[]){
    int maximo=MIN_VALUE;
    for(int i=0;i<x.length;i++){
      if(x[i]>maximo){
        maximo=x[i];
      }      
    }
    return maximo;
  }
  public static int[] generaArrayInt(int n,int maximo,int minimo){
    int[] x=new int[n];
    for(int i=0;i<x.length;i++){
      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);       
    }
    return x;   
  }
  
}
