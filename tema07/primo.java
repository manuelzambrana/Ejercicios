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
public class primo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
 int numero;
    int contadorDePrimos = 0;
    boolean esPrimo = true;
    int[] inicial = new int[20];
    
    for (int i = 0; i < 10; i++) {
      
      numero = (int)(Math.random() * 99 + 2);
      System.out.print(numero + " ");
      inicial[i] = numero;
    }
    
      System.out.println();
      
    for (int i = 0; i < 10; i++) {
      
      esPrimo = true;
      
      for (int r = 2; r < inicial[i]; r++) {
        
        if (inicial[i] % r == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo == true) {
        contadorDePrimos++;
      }
    }
    
    int[] primos = new int[contadorDePrimos];
    int indicePrimos = 0;
    
    for (int i = 0; i < 10; i++) {
      
      esPrimo = true;
      
      for (int r = 2; r < inicial[i]; r++) {
        
        if (inicial[i] % r == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo == true) {
        primos[indicePrimos] = inicial[i];
        indicePrimos++;
      }
    }
    
    if (contadorDePrimos == 0) {
      System.out.println("No se han encontrado números primos.");
    } else {
    
        System.out.print("Se han encontrado los siguientes números primos: ");
    
        for (int i = 0; i < contadorDePrimos; i++) {
          System.out.print(primos[i] + " ");
        }
      }
    }
  
  }

