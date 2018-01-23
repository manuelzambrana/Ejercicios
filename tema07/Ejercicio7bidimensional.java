/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Ejercicio7bidimensional {

    static final int vacio = 0;
    static final int mina = 1;
    static final int tesoro = 2;
    static final int intento = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[][] array = new int[5][4];
        Scanner s = new Scanner(System.in);
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                array[x][y] = vacio;
            }
        }
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        array[minaX][minaY] = mina;

        int tesoroX;
        int tesoroY;

        do {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);

        } while ((tesoroX == minaX) && (tesoroY == minaY));
        array[tesoroX][tesoroY] = tesoro;
   

        System.out.println("busca el tesoro");
        boolean acabarJuego = false;
        String c="";
        do {
            for (y = 3; y >= 0; y--) {
                System.out.print("|");
                for (x = 0; x < 5; x++) {
                    if (array[x][y] == intento) {
                        System.out.print("X ");
                    } 

                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");
            System.out.print("Coordenada x: ");
            x = s.nextInt();
            System.out.print("Coordenada y: ");
            y = s.nextInt();
            switch (array[x][y]) {
                case vacio:
                    array[x][y] = intento;
                    if((Math.abs(x-minaX)<2)&&(Math.abs(y-minaY)<2)){
                        System.out.println("cuidado hay una mina cerca");
                    }
                    break;
                case mina:
                    System.out.println("Lo siento, has perdido.");
                    acabarJuego = true;
                    break;
                case tesoro:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    acabarJuego = true;
                    break;
                default:
            }
        } while (!acabarJuego);
       
        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (array[x][y]) {
                    case vacio:
                        c = " ";
                        break;
                    case mina:
                        c = "* ";
                        break;
                    case tesoro:
                        c = "€ ";
                        break;
                    case intento:
                        c = "x ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");

        // TODO code application logic here
    }

}
