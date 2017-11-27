public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la capacidad de la cuba (en litros): ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int litros = (int)(Math.random()*(capacidad+1));
    
  for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("#    #");
      } else {
        System.out.println("#====#");
      }
    }
    System.out.println("######");
    

   
    
            
    
  
   
  }
}
