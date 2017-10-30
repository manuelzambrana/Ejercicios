/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio14{
  public static void main(String[] args) {
 
    int n,b,contador=0;
    System.out.println("Introduzca una base");
    n = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un exponente");
    b = Integer.parseInt(System.console().readLine());
    int aux=1;
    
    if(b==0){
      aux=1;
      
    }else if(b>1){
      for(int i = 0;i<b;i++){
        aux=aux*n;}
     }
        
    System.out.println(n + " ^ " + b + " es " + aux);
       
      

          
    
    
    
    
    
    
  
  }
  
}
