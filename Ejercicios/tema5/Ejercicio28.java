/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio28{
  public static void main(String[] args) {
    
    
    int n,i;
    System.out.println("Introduce un numero para saber su factorial");
    n = Integer.parseInt(System.console().readLine());
    int total=n;
    for(i=1;i<n;i++){
     
      total*=i;  
  }
   System.out.println(total);
 }
  
}
