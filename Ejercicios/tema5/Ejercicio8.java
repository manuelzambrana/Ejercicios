/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio8 {
  public static void main(String[] args) {
  
    
    System.out.println("introduce una tabla de multiplicar");
     int numero= Integer.parseInt(System.console().readLine());
    
    
    for(int i = 0; i<=10; i++){
       System.out.println("la tabla de multiplicar es: " + numero + " por " + i + " : " + (numero*i));
     }
      
    
      
     
   
  }
}
