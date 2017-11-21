/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio3{
  public static void main(String[] args) {
    
    int suma=0;
    int tirada;
    int palo=(int)(Math.random()*4)+1;
    int numero=(int)(Math.random()*10)+1;
    
    
    switch(numero){
      
      
      case 1:
        System.out.println("as");
        break;
      
      case 2:
        System.out.println("dos");
        break;
      case 3:
        System.out.println("tres");
        break;
      case 4:
        System.out.println("cuatro");
        break;
      case 5:
        System.out.println("cinco");
        break;
      case 6:
        System.out.println("seis");
        break;
      case 7:
        System.out.println("siete");
        break;
      
      case 8:
        System.out.println("sota");
        break;
      case 9:
        System.out.println("caballo");
        break;
      case 10:
        System.out.println("Rey");
        break;
      default:     
    }
    switch(palo){
      case 1:
        System.out.println("copas");
        break;
      case 2:
        System.out.println("espadas");
        break;
      case 3:
        System.out.println("oro");
        break;
      case 4:
        System.out.println("bastos");
        break;
      default:     
    }
    
    
   
    
   
   
      
    
    
  
  }  
}
