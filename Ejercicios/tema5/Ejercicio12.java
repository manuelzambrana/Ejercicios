/**
 * ejercicio 12
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio12{
  public static void main(String[] args) {
    
    
    System.out.println("introduce el total de numeros para la secuencia fibonacci  ");
    int numero=Integer.parseInt(System.console().readLine());
    int aux;
    int a=0,b=1;
    
   
      System.out.print("0,1,");
      while(numero>2){
      aux=a;
      a=b;
      b=aux+b;
      System.out.print(b+",");
      numero--;
    }
      
    
    
      
    
    
    
    
    
  }
}
      
    
