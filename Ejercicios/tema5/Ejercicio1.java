/**
 * multiplo 5
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("muestra Los multiplos de 5: ");
    
    int numero = 100;
    for(int aux = 0; aux<101;aux++){
      if(aux%5==0){
         System.out.println(aux + " es multiplo de 5");
       }
    }   
   
  }
}
