/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Ejercicio1;

/**
 *
 * @author manue
 */
public class caballoClass {

  private String nombre;
  private String color;
  private int edad;
  private int carrerasGanadas;

  caballoClass(String name, String color, int age, int race) {
    this.nombre = name;
    this.color = color;
    this.edad = age;
    this.carrerasGanadas = race;

  }

  public String getNombre() {
    return this.nombre;
  }

  public void cabalga() {
    System.out.println("tototootot");
  }

  public void relincha() {
    System.out.println("hiiiiiiiiiii");
  }

  public void rumia() {
    System.out.println("ñañaña");
  }
  

}
