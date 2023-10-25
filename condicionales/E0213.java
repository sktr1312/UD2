package condicionales;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        // E0213. Escribir un programa que pida una hora de la siguiente forma: hora,
        // minutos y segundos. El programa debe mostrar qué hora será un segundo más
        // tarde. Por ejemplo: hora actual (10:41:59) => hora actual + 1 segundo
        // (10:42:00)

        Scanner sc = new Scanner(System.in);
        byte hora, minutos, segundos;

        System.out.print("Ingresa la hora (0-23): ");
        hora = sc.nextByte();
        System.out.print("Ingresa los minutos (0-59): ");
        minutos = sc.nextByte();
        System.out.print("Ingresa los segundos (0-59): ");
        segundos = sc.nextByte();
        sc.close();

        segundos++;

        /*
         * switch (segundos) {
         * case 60:
         * segundos = 0;
         * minutos++;
         * case 59:
         * if (minutos == 60) {
         * minutos = 0;
         * hora++;
         * }
         * case 58:
         * if (hora == 24) {
         * hora = 0;
         * }
         * }
         */

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }

        }

        String horaTexto = String.format("La hora despues del incremento es: %02d:%02d:%02d", hora, minutos, segundos);
        System.out.printf("La hora un segundo más tarde es: %02d:%02d:%02d%n", hora, minutos, segundos);
        System.out.println(horaTexto);
    }
}