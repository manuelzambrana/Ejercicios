/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio9{
  public static void main(String[] args) {
    
    int numero=0;
    int contador=0;
    do{
      numero=(int)(Math.random()*100)+1;
      if(numero%2==0){        
        System.out.println(numero);
        contador++;
      }
      
      
      
      
      
    }while(numero!=24);
    System.out.println("El total de numeros pares es: "+contador);
   
      
    
    
  
  }  
}
