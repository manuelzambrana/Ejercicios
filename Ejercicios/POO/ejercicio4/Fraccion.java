/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author manue
 */
public class Fraccion {
  
  private int numerador;
  private int denominador;


  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  @Override
  public String toString() {
    return this.numerador + "/" + this.denominador;
  }
  
  
  public Fraccion invertir(){   
    return new Fraccion (this.denominador,this.numerador);
  }
  
  public Fraccion multiplica(int num){
    
    return new Fraccion(this.getNumerador()*num,this.denominador);
  }
  
  
 
  
  
  
  
  
}
