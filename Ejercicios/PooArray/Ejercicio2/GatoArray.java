/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author manue
 */
public class GatoArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Gato[] gato = new Gato[3];
    int i;

      gato[0]=new Gato("pepe","macho","persa");
      gato[1]=new Gato("pepe","macho","persa");
      gato[2]=new Gato("pepe","macho","persa");
    
    for (i = 0; i < 3; i++) {
      System.out.println("Nombre: " + gato[i].getNombre());

      System.out.println("Sexo: " + gato[i].getSexo());

      System.out.println("Raza: " + gato[i].getRaza());

    }
    
  }
  
}
