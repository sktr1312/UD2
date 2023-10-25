package condicionales;

import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {
        // E0211. Idear un programa que solicite al usuario un número comprendido entre
        // 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre del
        // día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a
        // “lunes” y el 6 a “sábado”

        Scanner sc = new Scanner(System.in);
        int numDiaUser;

        System.out.println("Introduzca un numero compredido entre 1 y 7: ");
        numDiaUser = sc.nextInt();
        sc.close();

        switch (numDiaUser) {
            case 1 -> {
                System.out.println("Es lunes");
            }

            case 2 -> {
                System.out.println("Es martes");
            }

            case 3 -> {
                System.out.println("Es miercoles");
            }

            case 4 -> {
                System.out.println("Es jueves");
            }

            case 5 -> {
                System.out.println("Es viernes");
            }

            case 6 -> {
                System.out.println("Es sabado");
            }

            case 7 -> {
                System.out.println("Es domingo");
            }

            default -> {
                System.out.println("El numero introducido no es correcto");
            }

        }
    }
}
