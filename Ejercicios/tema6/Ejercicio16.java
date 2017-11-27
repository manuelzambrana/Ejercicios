/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Manuel Zambrana Jiménez, 16/11/2017
 * */


public class Ejercicio16{
  public static void main(String[] args) {
    int i;
    int num1=0;
    int num2=0;
    int num3=0;
    for(i=0;i<=2;i++){      
       String tirada="";
       int casino=(int)(Math.random()*5)+1;
       
       switch(casino){
         case 1:
          tirada="corazón ";
          break;
        case 2:
          tirada="Campana ";
          break;
        
        case 3:
          tirada="Diamante ";
          break;
        
        case 4:
          tirada="Herradura ";
          break;
        
        case 5:
          tirada="Limón ";
          break;
        
        default:          
       }
       System.out.print(tirada);
       if(i==0){
         num1=casino;
       }else if(i==1){
         num2=casino;
       }else if(i==2){
         num3=casino;
       }        
     
   }
   if((num1==num2)&&(num1==num3)){
     System.out.println("Enhorabuena");
   }
   if((num1==num2)||(num1==num3)||(num2==num3)){
     System.out.println("Enhorabuena aqui tienes su moneda");
   }else{
      System.out.println("perdistes");
    }
      
     
       
       
       
    
  }  
}
