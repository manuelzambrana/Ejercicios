/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio29{
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca un primer numero (más grande que el segundo y positivo)");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un segundo numero (más pequeño que el primero y positivo)");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.print("Los números enteros positivos menores que " + numero1 );
    System.out.println(" que no son divisibles entre " + numero2 + " son los siguientes:");
    for(int i=1;i<=numero1;i++){
      if(i%numero2!=0){
        System.out.print(i+" ");
      }
    }
    
        
    
    
 
  
  }
  
}
