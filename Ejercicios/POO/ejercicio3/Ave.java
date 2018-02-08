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
public class Ave extends Animal {
   public Ave(String sexo, int edad) {
    super(sexo, edad);
  }
   int tiempoVuelo;
 
   public void vuelo(){
     if(this.tiempoVuelo<10){
       System.out.println("Estoy volando");
       tiempoVuelo++;
     }else{
       System.out.println("Me caigoooooooo");
     }
   }

   
   
  
}
