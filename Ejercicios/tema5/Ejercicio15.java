/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio15{
  public static void main(String[] args) {
 
    int n,b,contador=0;
    System.out.println("Introduzca una base");
    n = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un exponente");
    b = Integer.parseInt(System.console().readLine());
    
    
    for(int i=1;i<b+1;i++){
      System.out.println(n+" ^ "+i);;
    }
    
    
  
  }
  
}
