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
public class Ej10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int[] num = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int contadorPar=0;
    int contadorImpar=0;
    
    int aleatorio = 0;    
    int i = 0;
    
    for (i = 0; i < 20; i++) {
      aleatorio = (int) (Math.random() * 101);
      num[i] = aleatorio;
      if(num[i]%2==0){
        par[contadorPar]=num[i];
        contadorPar++;
      }else{
        impar[contadorImpar]=num[i];
        contadorImpar++;
      }

    }
    for (i = 0; i < 20; i++) {      
      System.out.print(num[i] + " ");
    }
    
    for (i = 0; i < contadorPar; i++) { 
      num[i]=par[i];
      
    }
    for (i = contadorPar; i <20; i++) { 
      num[i]=impar[i-contadorPar];
      
    }
    System.out.println("Los numeros ordenados son ");
    
    for (i = 0; i < 20; i++) {      
      System.out.print(num[i] + " ");
    }
    // TODO code application logic here
  }
  
}
