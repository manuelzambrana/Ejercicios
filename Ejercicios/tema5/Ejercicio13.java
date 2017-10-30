/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio13{
  public static void main(String[] args) {
    int contador = 0;
    int contadorPositivo = 0;
    int contadorNegativo = 0;
    int n;
    System.out.println("Introduzca 10 numeros para saber si son negativos o positivos");
    
    
    do{
       n = Integer.parseInt(System.console().readLine());
        if(n>=0){
          contadorPositivo++;
        }else{
          contadorNegativo++;
        }
          
      
      
      contador++;
    }while(contador<10);
    
    System.out.println(contadorPositivo + " nº son positivos y " + contadorNegativo + " nº son negativos");

          
    
    
    
    
    
    
  }
  
}

