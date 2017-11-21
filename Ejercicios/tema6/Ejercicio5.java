/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio5{
  public static void main(String[] args) {
    
    
    int tirada;
    int maximo=0;
    int minimo=10000;
    int media=0;
    int suma=0;
    
    for(int i=0;i<50;i++){
       tirada = (int)(Math.random() * 100) + 100;
       System.out.println(tirada + " ");
       suma+=tirada;
       media++;
       if(tirada<minimo){
         minimo=tirada;
       }
       if(tirada>maximo){
         maximo=tirada;
       }
            
    }
     System.out.println("la media es: "+suma/media);
     System.out.println("el minimo es: "+minimo);
     System.out.println("el maximo es: "+maximo);
    
    
   
    
   
   
      
    
    
  
  }  
}
