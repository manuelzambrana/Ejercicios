/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;
import tema9.ArrayFuncines;

/**
 *
 * @author manue
 */
public class ArraysEjerciciosFunciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int x[]=tema9.ArrayFuncines.generaArrayInt(100,20,7);
    tema9.ArrayFuncines.muestraArray(x);
    System.out.println("el Minimo es: "+tema9.ArrayFuncines.minimoArrayInt(x));
    System.out.println("el Maximo es: "+tema9.ArrayFuncines.maximoArrayInt(x));
    
    
    // TODO code application logic here
  }
  
}
