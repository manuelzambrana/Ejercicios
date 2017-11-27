public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la altura (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    

    if ((anchura < 4) || (altura < 4)) {

      System.out.print("Lo siento, los datos introducidos no son correctos, ");
      System.out.println(" el valor mínimo para la anchura y la altura es 4.");

    } else {
      int x=(int)(Math.random()*(anchura-2)+2);
      int y=(int)(Math.random()*(altura-2)+2);
      for(int i=1;i<=altura;i++){
        for(int k=1;k<=anchura;k++){
          if((i==1)||(i==altura)||(k==1)||(k==anchura)){
            System.out.print("*");
          }else if((i==y)&&(k==x)){
            System.out.print("&");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
            
    
  
      }
    } 
  }
}
