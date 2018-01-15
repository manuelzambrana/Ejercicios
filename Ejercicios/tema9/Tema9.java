<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import tema9.Ejercicio1;

/**
 *
 * @author manue
 */
public class Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //voltear
        System.out.println("el 4567 volteado es " + tema9.Ejercicio1.voltea(3434));
        //capicua
        if (tema9.Ejercicio1.esCapicua(29)) {
            System.out.println("el 29 es capicua");
        }

        if (tema9.Ejercicio1.esCapicua(767)) {
            System.out.println("el 767 es capicua");
        }
        //primo
        if (tema9.Ejercicio1.esPrimo(29)) {

            System.out.println("El 29 es primo");
        }

        if (tema9.Ejercicio1.esPrimo(80)) {
            System.out.println("El 80 es primo");
        }
        // siguientePrimo //////////////////////////////////////////////
        System.out.println("El siguiente primo mayor a 23 es " + tema9.Ejercicio1.siguientePrimo(23));

        System.out.println("El siguiente primo mayor a 100 es " + tema9.Ejercicio1.siguientePrimo(100));
        //potencia////////////////////
        System.out.println("la potencia 2^6 es: " + tema9.Ejercicio1.potencia(2, 6));
        System.out.println("la potencia 8^-6 es: " + tema9.Ejercicio1.potencia(8, -6));
        //numero de digitos//////////
        System.out.println("El numero 2345678 tiene " + tema9.Ejercicio1.digitos(2345678) + " digitos ");
        //digitoN
        System.out.println("el digito 2 de 3456278 es; " + tema9.Ejercicio1.digitoN(3456278, 2));
        //posiciondedigito////
        System.out.println("En el 78604321, el dígito 4 está en la posición " + tema9.Ejercicio1.posicionDeDigito(78604321, 4));

        System.out.println("En el 78604321, el dígito 1 está en la posición " + tema9.Ejercicio1.posicionDeDigito(78604321, 1));

        System.out.println("En el 78604321, el dígito 7 está en la posición " + tema9.Ejercicio1.posicionDeDigito(78604321, 7));

        System.out.println("En el 78604321, el dígito 5 está en la posición " + tema9.Ejercicio1.posicionDeDigito(78604321, 5));

        //juntar numeros
        System.out.println("los numeros unidos 8 y 4 es: " + tema9.Ejercicio1.juntaNumeros(8, 4));
        System.out.println("los numeros unidos 8786 y 4678 es: " + tema9.Ejercicio1.juntaNumeros(8786, 4678));
        //quitar numeros
        System.out.println("el numero 345678 si le quitamos dos cifras es " + tema9.Ejercicio1.quitaPorDetras(345678, 2));
        System.out.println("el numero 345678 si le quitamos dos cifras es " + tema9.Ejercicio1.quitaPorDelante(345678, 2));
        //unir por detras
        System.out.println("Si al 567 se le pega por detrás el 1 da el " + tema9.Ejercicio1.pegaPorDetras(567, 1));
        System.out.println("Si al 33 se le pega por detrás el 0 da el " + tema9.Ejercicio1.pegaPorDetras(33, 0));
        //pega por delante
        System.out.println("Si al 567 se le pega por delante el 1 da el " + tema9.Ejercicio1.pegaPorDelante(567, 1));
        System.out.println("Si al 33 se le pega por delante el 57 da el " + tema9.Ejercicio1.pegaPorDelante(33, 57));
        //trozo de numeros
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + tema9.Ejercicio1.trozoDeNumero(78604000, 0, 3));
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + tema9.Ejercicio1.trozoDeNumero(78604000, 4, 6));

        // TODO code application logic here
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import tema9.Ejercicio1;

/**
 *
 * @author manue
 */
public class Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //voltear
        System.out.println("el 4567 volteado es " + tema9.Ejercicio1.voltea(3434));
        //capicua
        if (tema9.Ejercicio1.esCapicua(29)) {
            System.out.println("el 29 es capicua");
        }

        if (tema9.Ejercicio1.esCapicua(767)) {
            System.out.println("el 767 es capicua");
        }
        //primo
        if (tema9.Ejercicio1.esPrimo(29)) {

            System.out.println("El 29 es primo");
        }

        if (tema9.Ejercicio1.esPrimo(80)) {
            System.out.println("El 80 es primo");
        }

        // TODO code application logic here
    }

}
>>>>>>> e4beec331375eec65f11c0dd86aab7f711de22ee
