/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio9 {
  public static void main(String[] args) {
  
    
    int numero = 1, i, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    i = numeroIntroducido;
    
    while (i > 10) {
      i /= 10;
      numero++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numero + " dígito/s.");

  }
}
