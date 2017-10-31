/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio17{
  public static void main(String[] args) {
   System.out.println("introduce un numero positivo");
   int n = Integer.parseInt(System.console().readLine());
   int total=0;
   if(n>=0){
     for(int i=n;i<n+100;i++){
      total+=i;
     
     }
   }else{
     System.out.println("introduce un numero positivo");
   }
   System.out.println(total);
    
   
     
    
    
    
    
    
    
      
    
    
    
    
      
     
   
  }
}
