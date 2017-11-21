/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio32{
  public static void main(String[] args) {
 
    int n;
    int aux=0;
    int suma=0;
    int longitudNumero=0;
    boolean par=false;
    System.out.println("Introduzca un numero");
    n = Integer.parseInt(System.console().readLine());
    
     
   
    
    
    while(n>0){
      aux=(aux*10)+(n%10);
      n=n/10;
      longitudNumero++;
    }
    System.out.print("Los digitos pares son: ");
    for(int i=0;i<longitudNumero;i++){
    
      int digito;
      digito= (int)(aux%10);
      if(digito%2==0){
        System.out.print(digito+" ");
        suma+=digito;
      }
      aux/=10;
    }
    System.out.print(" y su suma es: "+suma);
    
    
    
  }
}
        
      
