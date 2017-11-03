/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio15{
  public static void main(String[] args) {
 
    double n;
    int b;
    double aux;
    int exponente;
    
    System.out.println("Introduzca una base");
    n = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca un exponente");
    b = Integer.parseInt(System.console().readLine());
    
    for(int i=0;i<=b;i++){
      aux=1;
      exponente=i;
      for(int k=0;k<exponente;k++){
        aux=aux*n;
      }
      System.out.println(n+"^"+i+" es "+aux);
      
    }
     
    
      
    
    
    
    
  
  }
  
}
