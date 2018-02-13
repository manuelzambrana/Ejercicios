/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author manue
 */
public class Expocoches {

  private int entradasPorVender;

  public Expocoches(int tickets) {
    this.entradasPorVender = tickets;
  }

  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  public void vender(int tickets) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo sieto no me quedan entradad");
    } 
    else if (this.entradasPorVender < tickets) {
    
        System.out.println("Lo siento solo me quedan " + this.entradasPorVender + " entradas de esta zona");
    }
  
     

      
    if (this.entradasPorVender >= tickets) {
      entradasPorVender -= tickets;
      System.out.println("Toma tus " + tickets + " entradas");
    }
  }

  

}
