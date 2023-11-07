package paraninfo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        // Escribe una aplicación que solicite al usuario un número comprendido entre 0
        // y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        int numeroInvertido = 0;
        int numeroguardado;
        boolean entradaValida = false;

        do {
            try {
                System.out.println("Introduzca el número a comprobar (entre 0 y 9999): ");
                numero = sc.nextInt();
                entradaValida = true; 
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no está en el formato correcto. Intente de nuevo.");
                sc.next(); 
            }
        } while (!entradaValida);

        sc.close();
        numeroguardado = numero;

        while (numero != 0) {

            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;

        }

        if (numeroguardado == numeroInvertido) {
            System.out.println("El numero " + numeroguardado + " es capicua");
        } else {
            System.out.println("El numero " + numeroguardado + " no es capicua");
        }
    }
}
