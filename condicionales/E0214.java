package condicionales;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        // Crear una aplicación que solicite al usuario una fecha (día, mes, año) y
        // muestre la
        // fecha correspondiente al día siguiente.
        int dia, mes, año;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día del mes (1-31): ");
        dia = sc.nextInt();
        System.out.println("Introduce el número de mes (1-12): ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        año = sc.nextInt();
        sc.close();

        dia++;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia > 31) {
                    dia = 1;
                    mes++;
                    if(mes > 12) {
                        mes = 1;
                        año++;
                    } 
                }
                
            }
            case 4, 6, 9, 11 ->{
                if (dia > 30) {
                    dia = 1;
                    mes++;
                }

            }
            case 2 -> {
                if (dia > 28) {
                    dia = 1;
                    mes++;
                }

            }

            default -> {
                System.out.println("Numero de mes no valido");
            }
        }

        System.out.printf("La fecha un dia despues será: %02d/%02d/%02d%n", dia, mes, año);

    }
}
