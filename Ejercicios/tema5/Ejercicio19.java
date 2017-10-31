/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio19{
  public static void main(String[] args) {
 
    
    System.out.println("Introduzca una altura de la piramide");
    int h = Integer.parseInt(System.console().readLine());
    
    int altura=1;
    int espacios=h;
    int i=0;
    
    
    while(altura<=h){
      
    
      for( i=1;i<espacios;i++){
        System.out.print(" ");
      }
      for(i=1;i<altura*2;i++){
        System.out.print("*");
      }
      System.out.println();
      espacios--;
      altura++;
      
        
    }
    
      
    
       
      

          
    
    
    
    
    
    
  
  }
  
}
