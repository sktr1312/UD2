package ejercicios;

import java.util.Scanner;

public class contadorcifas {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 99999: ");
        numero = scanner.nextInt();
        scanner.close();

        if (numero < 0 && numero > 99999) {
            System.out.println("El numero no se encuentra en el rango");
        } else {
            if (numero / 10 == 0) {
                System.out.println("El numero tiene 1 cifra");
            } else {
                if (numero / 100 == 0) {
                    System.out.println("El numero tiene 2 cifras");
                } else {
                    if (numero / 1000 == 0) {
                        System.out.println("El numero tiene 3 cifras");

                    } else {
                        if (numero / 10000 == 0) {
                            System.out.println("El numero tiene 4 cifras");
                        } else {
                            if (numero / 100000 == 0) {
                                System.out.println("El numero tiene 5 cifras");
                            }
                        }
                    }
                }

            }

        }

    }
}
