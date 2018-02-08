/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author manue
 */
public class Bicicleta extends Vehiculo {

  String modeloRueda;

  public Bicicleta(String modeloRueda) {
    super();
    this.modeloRueda = modeloRueda;
  }

  public String getModeloRueda() {
    return modeloRueda;
  }

  public void setModeloRueda(String modeloRueda) {
    this.modeloRueda = modeloRueda;
  }

  public void derrapa() {
    System.out.println("yiiiiiiiiii");
  }

}
