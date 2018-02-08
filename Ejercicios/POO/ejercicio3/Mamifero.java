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
public class Mamifero extends Animal {

  public Mamifero(String sexo, int edad) {
    super(sexo, edad);
  }

  

  public void ponerCria() {
    if (this.getSexo() == "macho") {
      System.out.println("Lo siento no pongo crias ");
    }else{
      System.out.println("Que cria más bonita");
    }
    

  }
}
