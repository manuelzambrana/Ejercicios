/**
 * caja fuerte 
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    
    int solucion = 5647;
    int intentos = 4;
    boolean acertar = false;

    
    do{
      System.out.println("intenta acertar la combinacion de la caja fuerte tienes " + intentos + " oportunidades");
      int combinacion=Integer.parseInt(System.console().readLine());
      intentos--;
      if(combinacion==solucion){
        System.out.println("La caja fuerte se abrio con exito");
        acertar  = true;
      }
      else{
        System.out.println("Lo siento combinacion incorrecta");
       }
        
      
    }
    while((intentos>0)&&(acertar==false));
    
    
    
 
 }
}
