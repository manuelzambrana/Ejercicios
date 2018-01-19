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
public class ex1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
        int[] inicial = new int[15];
    int numero;
    
    System.out.println("Array original: ");
    
    for (int i = 0; i < 15; i++) {
      
      numero = (int)(Math.random() * 501);
      System.out.print(numero + " ");
      inicial[i] = numero;
    }
    
    int[] resultado = new int[15];
    
      for (int i = 0; i < 15; i++) {
      
        if (inicial[i] % 5 == 0) {
          resultado[i] = inicial[i];
        } else {
          
          for (int r = 0; inicial[i] % 5 != 0; r++) {
            inicial[i]++;
          }
          
          resultado[i] = inicial[i];
        }
      }
      
    System.out.println();
    System.out.println("Array final: ");
    
    for (int i = 0; i < 15; i++) {

      System.out.print(resultado[i] + " ");

    }
  }
}

    // TODO code application logic here
 