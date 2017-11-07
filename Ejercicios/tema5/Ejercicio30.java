/**
 * Ejercicio30 tema 5
 * 
 * 
 * @author Manuel zambrana
 */
public class Ejercicio30 {

  public static void main(String[] args) {
    System.out.println("Introduzca un  primer dia de la semana en numero");
    int primerDia= Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca una hora del  primer dia introducido (sin mintuos)");
    int primeraHora= Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un  segundo dia de la semana en numero");
    int segundoDia= Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca una hora del  segundo dia introducido (sin mintuos)");
    int segundaHora= Integer.parseInt(System.console().readLine());
    
    if(primerDia<segundoDia){
      System.out.print("Entre las " + primeraHora + ":00h del " + " dia "+ primerDia);
      System.out.print(" y las " + segundaHora + ":00h del " + " dia "+ segundoDia);
      System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");
    }
    

  }
}
