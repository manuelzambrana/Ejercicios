/**
 * Calcular area triangulo
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la base del triangulo ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la altura del triangulo ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("el area del triangulo es " + (primerNumero*segundoNumero)/2);
 
    
   
  }
}
