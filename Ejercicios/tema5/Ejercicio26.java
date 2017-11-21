/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio26{
  public static void main(String[] args) {
 
    int n,numero;
    int aux=0;
    int posicion=1;
    System.out.println("Introduzca un numero");
    n = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el numero a buscar");    
    numero = Integer.parseInt(System.console().readLine());
    
    
    while(n>0){
      aux=(n%10)+(aux*10);
      n=n/10;      
    }
    while(aux>0){
          if((aux%10)==numero){
          System.out.println(numero + " se encuentra en la posicion " +posicion );
          } 
          aux=aux/10;
          posicion++;
        }
    
  }
}
        
      
    
    
    
    
    
      
          
      
      
      
    
      
    
    
 
       
      

          
    
    
    
  
