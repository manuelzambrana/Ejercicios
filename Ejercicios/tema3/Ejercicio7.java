/**
 * Calcular factura
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio7
 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la base imponible ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    double total= (primerNumero*0.21)+primerNumero;
    
    
    System.out.println("el total de la factura es: " + total);
 
    
   
  }
}
