/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author manue
 */
public class Pizza {
  private String tamano;
  private String tipo;
  private String estado;
  private static int pizzaPedidas=0;
  private static int pizzaServidas=0;
  

  public Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    pizzaPedidas++;
  }

  @Override
  public String toString() {
   return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }
  

  public static int getPizzaPedidas() {
    return pizzaPedidas;
  }

  public static int getPizzaServidas() {
    return pizzaServidas;
  }
  
  
  public void sirve(){
    if(this.estado.equals("pedida")){
      this.estado="servida";
      pizzaServidas++;
    }else{
      System.out.println("Lo siento ya hemos servido la pizza");
    }
    
  }
  
  
  
  
  
  
}
