/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author manue
 */
public class Ejercicio1 {
   /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
    public static long voltea(long x) {
        if(x<0){
            return -voltea(-x);            
        }
        long numero=0;
        while(x>0){
            numero=(numero*10)+(x%10);
            x=x/10;
        }
        return numero;
    }
     public static int voltea(int x) {
    return (int)voltea((long)x);
  }
      /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     falso en caso contrario.
   * <p>
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   * 
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */     
     public static boolean esCapicua(long x){         
         return x==voltea(x);
     }
      /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     falso en caso contrario.
   * <p>
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   * 
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */
    public static boolean esCapicua(int x) {
    return esCapicua((long)x);
  }
    /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * <p>
   * Un número es primo cuando es divisible únicamente entre el mismo y entre 1.
   *
   * @param x número del que se quiere saber si es primo
   * @return  verdadero si el número que se pasa como parámetro es primo y falso
   *          en caso contrario
   */
   public static boolean esPrimo(int x){
       for(int i=2;i<x;i++){
           if((x%i)==0){
               return false;
           }          
       }
       return true;
   }

   

    
    
    
}
