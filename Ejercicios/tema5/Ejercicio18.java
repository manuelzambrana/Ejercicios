/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio18{
  public static void main(String[] args) {
   System.out.println("introduce un primer numero ");
   int n = Integer.parseInt(System.console().readLine());
   System.out.println("introduce un segundo numero ");
   int b = Integer.parseInt(System.console().readLine());
   int aux;
   
   if(b<n);{
     aux=n;
     n=b;
     b=aux;
   
   
 }
   for(int i=n;i<b;i=i+7){
     System.out.println("los numeros son: "+i);
   }
 
    
      
     
   
  }
}
