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
public class Ejercicio6Bidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num[][] = new int[6][10];
        int fila;
        int columna;
        int maximo = Integer.MIN_VALUE;
        int filaMaxima = 0;
        int columnaMaxima = 0;
        int minimo = Integer.MAX_VALUE;
        int filaMinima = 0;
        int columnaMinima = 0;
        boolean repetir;
        int i;
        int j;

        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                do {
                    num[fila][columna] = (int) (Math.random() * 1001);
                    repetir = false;
                    for (i = 0; i < 10 * fila + columna; i++) {
                        if (num[fila][columna] == num[i / 10][i % 10]) {

                            repetir = true;

                        }
                    }

                } while (repetir);
            }
        }

        for (fila = 0; fila < 6; fila++) {

            for (columna = 0; columna < 10; columna++) {

                if (num[fila][columna] < minimo) {
                    minimo = num[fila][columna];
                    filaMinima = fila;
                    columnaMinima = columna;

                }
                if (num[fila][columna] > maximo) {
                    maximo = num[fila][columna];
                    filaMaxima = fila;
                    columnaMaxima = columna;

                }

            }

        }
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                System.out.printf("%4d   ", num[fila][columna]);
            }
            System.out.println();
        }
        System.out.println("\n\nEl máximo es " + maximo + " y está en la fila " + filaMaxima + ", columna " + columnaMaxima);

        System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinima + ", columna " + columnaMinima);
    }
}
