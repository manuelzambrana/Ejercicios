/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio11{
  public static void main(String[] args) {
    
    
    int nota;
    int longitud=0;
    
    for(int k=1;k<=20;k++){ 
       longitud=(int)(Math.random()*40)+1; 
       nota=(int)(Math.random() * 5)+1;    
      
        switch(nota){
          case 1:
             System.out.print("nota "+k+" insuficiente");
            break;
          case 2:
             System.out.print("nota "+k+" Suficiente");
            break;
          case 3:
             System.out.print("nota "+k+" bien");
            break;
          case 4:
             System.out.print("nota "+k+" notable");
            break;
          case 5:
            System.out.print("nota "+k+" Sobresaliente");
            break;
          default:
        }
        
      System.out.println();
    }
    
  
  }  
}
