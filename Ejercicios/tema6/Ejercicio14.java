/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio14{
  public static void main(String[] args) {
    
    int numero=0;
    int contador=0;
    boolean acertar=false;
    String palabra="";
    numero=(int)(Math.random()*100)+1;
    do{
      contador++;
      
      System.out.println(numero);
      if(acertar==false){
        System.out.println("el numero es mayor o menor");
        palabra=System.console().readLine();
        if(palabra.equals("mayor")){
          numero=(int)(Math.random()*100-numero)+numero;
        }
        if(palabra.equals("menor")){
          numero=(int)(Math.random()*numero)+0;
        }
          
      }
      if(palabra.equals("si")){
        System.out.println("Enhorabuena");
        acertar=true;
      }
      

      
      
    }while((contador<5)&&(acertar==false));
  
    
    
  
  }  
}
