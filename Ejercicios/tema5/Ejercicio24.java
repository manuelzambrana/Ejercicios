/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio24{
  public static void main(String[] args) {
    int n,h;
    System.out.println("Introduce un numero cual quiera");
    n = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la altura");
    h = Integer.parseInt(System.console().readLine());
    
    int altura=0;
    int espacios=h-1;
    int i=0;
    while(altura<h){
      for(i=1;i<=espacios;i++){
          System.out.print(" ");
        }
      
        for(i=n;i<=n+altura;i++){
          System.out.print(i);
        } 
        for(i=altura;i>0;i--){
          System.out.print(i);
        }      
      System.out.println("");
      altura++;
      espacios--;
    }   
  
  }
  
}
