/*
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio23{
  public static void main(String[] args) {
    
    double n;
    double total=0;
    int contador=0;
    System.out.println("Introduzca numeros, el programa parará cuando su suma sea superior a 1000");
    do{     
      n = Double.parseDouble(System.console().readLine());
      total+=n;
      contador++;
    }while(total<1000);
    System.out.println("el total acumulado es: "+total);
    System.out.println("el total de numeros acumulados es: "+contador);
    System.out.println("la mdeia es: "+(total/contador));
    
    
    
 
  
  }
  
}
