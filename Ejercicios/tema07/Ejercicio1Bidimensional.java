/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

/**
 *
 * @author manue
 */
public class Ejercicio1Bidimensional {
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array [][]= new int [3][6];
        array[0][0]=0;
        array[0][1]=30;
        array[0][2]=2;        
        array[0][5]=5;
        array[1][0]=75;
        array[1][4]=0;
        array[2][2]=-2;
        array[2][3]=9;
        array[2][5]=11;
        int i=0;
        for(i=0;i<3;i++){
            for(int x=0;x<6;x++){
                System.out.print(array[i][x]+" ");
            }
            System.out.println();
        }
        
        // TODO code application logic here
    }
    
}
