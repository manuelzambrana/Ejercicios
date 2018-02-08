/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author manue
 */
public class Pinguino extends Ave {
  
  public Pinguino(String sexo, int edad) {
    super(sexo, edad);
  }
  
  public void vuela(){
    System.out.println("Lo siento no puedo volar");
  }
  
  
}
