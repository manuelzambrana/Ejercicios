/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio33{
  public static void main(String[] args) {
 
    
    System.out.println("Introduzca una altura de la u");
    int h = Integer.parseInt(System.console().readLine());
    
    int altura=1;
    int espacios=h-2;
    int i=0;
    int espaciosDeDentro=0;
    while(altura<h){
        System.out.print("*");
        for(i=1;i<h;i++){
          System.out.print(" ");
        }
        System.out.println(" *");
      altura++;
    }
      System.out.print(" ");
      for(i=1;i<altura-1;i++){
        System.out.print("* ");
      }
   
    
      
       
    
  
  }
  
}
