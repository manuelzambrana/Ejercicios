/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio25{
  public static void main(String[] args) {
    
    System.out.println("Introduzca un numero");
    int n = Integer.parseInt(System.console().readLine());
    
    int aux=0;
    
    
    while(n>0){
      aux= (aux*10) + (n%10);
      n=n/10;
    }
    System.out.println(aux);
    

   

   
   
    
 
  
  }
  
}
