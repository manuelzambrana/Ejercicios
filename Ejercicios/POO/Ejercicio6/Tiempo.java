/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author manue
 */
public class Tiempo {


  private int segundos;

  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }

  public Tiempo(int s) {

    this.segundos = s;
  }

  
  public String toString() {
    int segundos = this.segundos;
    int horas = segundos / 3600;
    segundos -= horas * 3600;
    int minutos = segundos / 60;
    segundos -= minutos*60;
    if (this.segundos < 0) {
      return "-("+(-horas) + "H" + (-minutos) + "M" + (-segundos) + "S)";

    } else {
      return horas + "H" + minutos + "M" + segundos + "S";

    }

  }

  private int getSegundos() {
    return this.segundos;
  }

  public Tiempo suma(Tiempo time) {
    return new Tiempo(this.segundos + time.getSegundos());

  }

  public Tiempo resta(Tiempo time) {
    return new Tiempo(this.segundos - time.getSegundos());

  }

}
