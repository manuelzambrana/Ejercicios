/**
 * multiplo 5
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("muestra Los multiplos de 5: ");
    
    int numero = 100;
    int aux=0;
    do{
      if(aux%5==0){
         System.out.println(aux + " es multiplo de 5");
         
       }
       aux++; 
       
    }  
    while(aux<101);
   
   
  }
}
