package paraninfo;

import java.util.Scanner;

public class EP0212 {

    // EI DNI consta de un entero de 8 digitos seguido de una letra que se obtiene a
    // partir del número de la siguiente forma: letra = número DNI módulo 23
    // y diseña una aplicación en la que, dado un número de DNI, calcule la letra
    // que le corresponde. Observa que un número de 8 digitos está dentro del rango
    // del tipo int.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDni = 0;
        char letraDni = '0';

        System.out.println("Introduzca su numero de DNI para calcular su letra: ");
        numDni = sc.nextInt();
        sc.close();
        int numeroDeLetra = numDni % 23;

        switch (numeroDeLetra) {
            case 0 -> letraDni = 'T';
            case 1 -> letraDni = 'R';
            case 2 -> letraDni = 'W';
            case 3 -> letraDni = 'A';
            case 4 -> letraDni = 'G';
            case 5 -> letraDni = 'M';
            case 6 -> letraDni = 'Y';
            case 7 -> letraDni = 'F';
            case 8 -> letraDni = 'P';
            case 9 -> letraDni = 'D';
            case 10 -> letraDni = 'X';
            case 11 -> letraDni = 'B';
            case 12 -> letraDni = 'N';
            case 13 -> letraDni = 'J';
            case 14 -> letraDni = 'Z';
            case 15 -> letraDni = 'S';
            case 16 -> letraDni = 'Q';
            case 17 -> letraDni = 'V';
            case 18 -> letraDni = 'H';
            case 19 -> letraDni = 'L';
            case 20 -> letraDni = 'C';
            case 21 -> letraDni = 'K';
            case 22 -> letraDni = 'E';
            default -> System.out.println("El numero de DNI no es correcto");

        }

        System.out.println("su DNI con la letra será: " + numDni + letraDni);
    }
}
