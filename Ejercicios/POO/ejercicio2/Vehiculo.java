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
public class Vehiculo {

  private static int vehiculosCreados;
  private static int kilometrosTotales;  
  private int kilometrosRecorridos;
  
  public Vehiculo(){
    this.kilometrosRecorridos=0;    
  }  

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  
  public void recorre(int k){
    this.kilometrosRecorridos+=k;
    Vehiculo.kilometrosTotales+=k;
    
  }
  
  
  

}
