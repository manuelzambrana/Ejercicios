/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author manue
 */
public class ArrayDiscos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Discos[] disco=new Discos[3];
    
      disco[0]=new Discos("pepe viena","latido",7,23);
      disco[1]=new Discos("rosa","lele",4,1);
      disco[2]=new Discos("tamaro","dia",3,1);
      
      for(int i=0;i<3;i++){
        System.out.print(disco[i].getAutor()+" ");
        System.out.print(disco[i].getNombreDisco()+" ");
        System.out.print(disco[i].getNumeroConciertos()+" ");
        System.out.print(disco[i].getNumeroPremios()+" ");
        System.out.println();
        
      }
    
  }
  
}
