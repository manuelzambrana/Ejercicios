/**
 * ejercicio 7 y 8 notas
 *
 * @author Manuel Zambrana Jimenez
 */

public class Ejercicio34{
  public static void main(String[] args) {
 
    int n,b;
    int pares=0;
    int impares=0;
    int longitudNumero=0;
    int aux=0;
    int aux1=0;
   
   
    
    System.out.println("Introduzca un numero");
    n = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un segundo  numero");
    b = Integer.parseInt(System.console().readLine());
    
     
   
    
    
    while(n>0){
      aux=(n%10)+(aux*10);
      n/=10;
      longitudNumero++;
    }
    while(b>0){
      aux1=(b%10)+(aux1*10);
      b/=10;
    }
    int digito;
    int numPar=0;
    int numImpar=0;
    
    
    for(int i=0;i<longitudNumero;i++){
       
       digito = (int)(aux%10);
       
       if((digito%2)==0){
         numPar=numPar*10+digito;
       }else{
         numImpar=numImpar*10+digito;
       }
       digito = digito = (int)(aux1%10);
       if(digito%2==0){
         numPar=numPar*10+digito;
       }else{
         numImpar=numImpar*10+digito;
       }
       aux/=10;
       aux1/=10;
     }
     System.out.println(numPar);
     System.out.println(numImpar);
         
       
       
    
      
      
      
        
    
     
    
    
    
  }
}
