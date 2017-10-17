/**
 * calcular salario
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Introduce las horas trabajadas para saber salario");
    int hora = Integer.parseInt(System.console() .readLine());
    int salario = hora*12;
    int salarioExtra = hora*16;
    
    if(hora<=40){
      System.out.println("tu salario es de: "+ salario);
    }
    
    else{
      System.out.println("tu salario es de:" + salarioExtra);
    }
    
   
  }
}
