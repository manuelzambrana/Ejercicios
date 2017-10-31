/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio16{
  public static void main(String[] args) {
    boolean primo=true;
    
    System.out.println("introduce numeros para saber si es  primo ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for(int aux=2;aux<numero;aux++){
      if(numero%aux==0){
        primo=false;
      }
    }
    if(primo==true){
      System.out.println("es primo");
    }else{
      System.out.println("no es primo");
    }
      
        
      
        
      
   
  }
}
