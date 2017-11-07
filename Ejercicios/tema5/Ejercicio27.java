/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio27{
  public static void main(String[] args) {
    
    
    int n,i;
    int total=0;
    int contador=0;
    System.out.println("Introduzca un numero para saber los numero primos entre 3");
    n = Integer.parseInt(System.console().readLine());
    
    for(i=1;i<=n;i++){
      if((i%3)==0){
        System.out.print(i+" ");
        contador++;
        total+=i;
      }
      
    }
    System.out.print("desde 1 hasta "+n+" hay "+contador+" numeros");
    System.out.print(" y la suma es "+total);
    
        
   
    
    
    
 
  
  }
  
}
