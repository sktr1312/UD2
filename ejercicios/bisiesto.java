package ejercicios;

import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        boolean esBisiesto;

        System.out.println("Introduzca el año a comprobar: ");
        año = sc.nextInt();
        sc.close();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            // System.out.println("El año " + año + " es bisiesto");
            esBisiesto = true;
        } else {
            // System.out.println("El año no es bisiesto");
            esBisiesto = false;

        }

        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }

        // if anidados, ejemplo.
        if (año % 4 == 0) {
            if (año % 100 != 0) {
                esBisiesto = true;
            } else {
                if (año % 400 == 0) {
                    esBisiesto = true;
                }
            }
        }
    }
}