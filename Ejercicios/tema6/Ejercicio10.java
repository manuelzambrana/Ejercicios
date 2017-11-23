/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio10{
  public static void main(String[] args) {
    
    String simbolo="";
    int r;
     int longitud=0;
    
    for(int k=0;k<10;k++){ 
       longitud=(int)(Math.random()*40)+1; 
       r=(int)(Math.random() * 6)+1;    
      
        switch(r){
          case 1:
            simbolo="*";
            break;
          case 2:
            simbolo="-";
            break;
          case 3:
            simbolo="=";
            break;
          case 4:
            simbolo=".";
            break;
          case 5:
            simbolo="|";
            break;
          case 6:
            simbolo="@";
            break;
          default:
        }
        for(int j = 1; j <= longitud; j++) {
          System.out.print(simbolo);
        }     
      System.out.println();
    }
    
  
  }  
}
