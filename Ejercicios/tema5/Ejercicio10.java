/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio10{
  public static void main(String[] args) {
    int cantidad=0;
    double numero=0;
    double total= 0;
    
    while(numero>=0){
    
    System.out.println("introduce numeros para saber su media ");
    numero = Double.parseDouble(System.console().readLine());
    cantidad++;
    total+=numero;
    
    
   }
   System.out.println((total-numero)/(cantidad-1));
   
   
  
    
   
     
    
    
    
    
    
    
      
    
    
    
    
      
     
   
  }
}
