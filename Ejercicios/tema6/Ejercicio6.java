/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio6{
  public static void main(String[] args) {
    
    
    int numero=0; 
    int contador=5;
    int adivinar= (int)(Math.random()*100)+0;
    boolean acertar=false;
    
    
    do{
      System.out.println("Introduce la contraseña de la caja fuerte te quedan "+contador+" oportunidades");
      numero=Integer.parseInt(System.console().readLine());
      contador--;
      if(numero==adivinar){
        acertar=true;
      }
      if(numero<adivinar){
        System.out.println("el numero introducido es menor que el aleatorio");
      }
      if(numero>adivinar){
        System.out.println("el numero introducido es mayor que el aleatorio");
      }
      
      
        
        
        
      
      
    }while((contador>0)&&(acertar==false));
    
    

    
   
    
   
   
      
    
    
  
  }  
}
