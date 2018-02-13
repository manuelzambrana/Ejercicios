/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class PruebaCoche {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Expocoches principal = new Expocoches(1000);
    Expocoches compraVenta = new Expocoches(200);
    Expocoches vip = new Expocoches(25);

    int opcion1 = 0;
    int opcion2 = 0;
    int entradas = 0;

    do {

      System.out.println("\n\nEXPOCOCHES CAMPANILLAS");

      System.out.println("1. Mostrar número de entradas libres");

      System.out.println("2. Vender entradas");

      System.out.println("3. Salir");

      System.out.println("Elige una opción: ");
      opcion1 = s.nextInt();

      if (opcion1 == 1) {
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());

        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());

        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());

      }
      if (opcion1 == 2) {
        System.out.println("\n\n1. Principal");

        System.out.println("2. Compra-venta");

        System.out.println("3. Vip");

        System.out.print("Elige la zona para la que quieres comprar las entradas: ");

        opcion2 = s.nextInt();

        System.out.print("¿Cuántas entradas quieres? ");

        entradas = s.nextInt();
      }
      switch(opcion2){
        case 1:
          principal.vender(entradas);
          break;
        case 2:
          compraVenta.vender(entradas);
          break;
        case 3:
          vip.vender(entradas);
          break;
        default:   
        
      }

    } while (opcion1 < 3);

  }

}
