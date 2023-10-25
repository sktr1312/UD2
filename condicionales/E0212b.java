package condicionales;

import java.util.Scanner;

public class E0212b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();
        scanner.close();

        boolean esFechaValida = validarFecha(dia, mes, año);

        if (esFechaValida) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }

    public static boolean validarFecha(int dia, int mes, int año) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1) {
            return false;
        }

        switch (mes) {
            case 2: // Febrero
                if (dia > 28) {
                    return false;
                }
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                if (dia > 30) {
                    return false;
                }
                break;
            default:
                if (dia > 31) {
                    return false;
                }
                break;
        }

        return true;
    }

}
