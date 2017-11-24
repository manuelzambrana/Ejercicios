/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Manuel Zambrana Jiménez, 16/11/2017
 * */


public class Ejercicio15{
  public static void main(String[] args) {
    int numero=(int)(Math.random()*6)+1;
    
    for(int i=0;i<numero;i++){
      for(int k=0;k<4;k++){
      
  
       int musica=(int)(Math.random()*7)+1;
       String nota="";
       
       switch(musica){
         case 1:
          nota="do ";
          break;
        case 2:
          nota="Re ";
          break;
        
        case 3:
          nota="Mi ";
          break;
        
        case 4:
          nota="Fa ";
          break;
        
        case 5:
          nota="Sol ";
          break;
        
        case 6:
          nota="La ";
          break;
        
        case 7:
          nota="Si ";
          break;
        default:     
         
         
       }
       
      
       System.out.print(nota);
       
     }
     System.out.print("|");
         
    }
    System.out.print("|");
  }  
}
