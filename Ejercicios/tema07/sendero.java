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
public class sendero {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int espacios = 14;
    int relleno = 4;
    int giros = 0;
    boolean obstaculo;
    int probabilidadDeAparecer;
    int posicionObstaculo;
    int tipoObstaculo;

    System.out.println("Seleccione la longitud en metros: ");
    Scanner s = new Scanner(System.in);
    int longitud=s.nextInt();

    for (int e = 0; e < longitud; e++) {

      probabilidadDeAparecer = (int) (Math.random() * 2);

      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }

      switch (probabilidadDeAparecer) {

        case 0:

          System.out.print("#");

          for (int i = 0; i < relleno; i++) {
            System.out.print(" ");
          }

          System.out.print("#");
          System.out.println();

          giros = (int) (Math.random() * 3);

          switch (giros) {
            case 0:
              espacios--;
              break;
            case 1:
              espacios=espacios;
              break;
            case 2:
              espacios++;
              break;
          }
          break;

        case 1:

          posicionObstaculo = (int) (Math.random() * 4);
          tipoObstaculo = (int) (Math.random() * 2);

          switch (tipoObstaculo) {
            case 0:

              obstaculo = false;
              System.out.print("#");

              for (int i = 0; i < relleno; i++) {

                if (obstaculo == false) {

                  if (i == posicionObstaculo) {
                    System.out.print("*");
                    obstaculo = true;
                  } else {
                    System.out.print(" ");
                  }
                } else {
                  System.out.print(" ");
                }
              }

              System.out.print("#");
              System.out.println();

              giros = (int) (Math.random() * 3);

              switch (giros) {
                case 0:
                  espacios--;
                  break;
                case 1:
                  espacios = espacios;
                  break;
                case 2:
                  espacios++;
                  break;
              }
              break;

            case 1:

              obstaculo = false;
              System.out.print("#");

              for (int i = 0; i < relleno; i++) {

                if (obstaculo == false) {

                  if (i == posicionObstaculo) {
                    System.out.print("O");
                    obstaculo = true;
                  } else {
                    System.out.print(" ");
                  }
                } else {
                  System.out.print(" ");
                }
              }

              System.out.print("#");
              System.out.println();

              giros = (int) (Math.random() * 3);

              switch (giros) {
                case 0:
                  espacios--;
                  break;
                case 1:
                  espacios = espacios;
                  break;
                case 2:
                  espacios++;
                  break;
              }
              break;
          }
      }
    }
  }
}
// TODO code application logic here

