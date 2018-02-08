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
public class pruenaAnimal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Mamifero leon=new Mamifero("macho",3);
    Pinguino pepe=new Pinguino("macho",5);
    
    
    System.out.println(leon.getSexo());
    
    leon.ponerCria();
    
    Ave paloma=new Ave("macho",3);
    int i=0;
    do{
      paloma.vuelo();
      i++;
    }while(i<=10);
    pepe.vuela();
    pepe.vuelo();
    
    // TODO code application logic here
  }
  
}
