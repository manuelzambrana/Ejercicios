/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio21{
  public static void main(String[] args) {
    System.out.println("Calcular total de numeros introducidos, media de los impares y mayor de los pares");
    
    int cantidadN=0;
    double totalImpar=0;
    int cantidadImpar=0;
    double n=0;
    double aux=0;
    
    while(n>=0){
      cantidadN++;
      System.out.println("Introduzca un numero positivo y para acabar uno negativo");
      n = Double.parseDouble(System.console().readLine());
      
      if(n%2!=0){
        cantidadImpar++;
        totalImpar+=n;
        
      }else{
        if(n>aux){
          aux=n;
        }
        
        
      }
          
      
    }
    System.out.println("La media de los impares es "+((totalImpar-n)/(cantidadImpar-1)));
    System.out.println("La cantidad total de numeros introducidos es: "+(cantidadN-1));
    System.out.println("El numero mayor es: "+aux);
    
    
    
    
  
  }
  
}
