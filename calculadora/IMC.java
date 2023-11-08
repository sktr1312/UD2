package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double pesoUsuario = 0;
        int alturaUsuario = 0;
        boolean entradaCorrecta;
        entradaCorrecta = false;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca el peso en Kg(20-300Kg): ");
                pesoUsuario = sc.nextDouble();
                System.out.println("Introduzca su altura en cm(50-250cm): ");
                alturaUsuario = sc.nextInt();
                if (alturaUsuario < 50 || alturaUsuario > 250 && pesoUsuario < 20 || pesoUsuario > 300) {
                    System.out.println("Uno de los numeros introducidos no esta en el rango adecuado");
                    continue;
                } else {
                    entradaCorrecta = true;
                    sc.close();
                }
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no es correcto");
            }
        } while (!entradaCorrecta);

        double indiceMasa = imc(pesoUsuario, alturaUsuario);
        System.out.printf("Su IMC es: %.2fKg/m^2 | %s ", indiceMasa, valorImc(indiceMasa));

    }

    static double imc(double pesoUsuario, double alturaUsuario) {
        double indiceMasa;
        indiceMasa = (pesoUsuario / Math.pow((alturaUsuario / 100), 2));
        return indiceMasa;
    }

    static String valorImc(double indiceMasa) {
        String valorIndice;
        if (indiceMasa < 18.50) {
            valorIndice = "-Bajo peso";
        } else if (indiceMasa < 24.99 && indiceMasa > 18.50) {
            valorIndice = "Normal";
        } else if (indiceMasa < 30 && indiceMasa > 18.50) {
            valorIndice = "Sobrepeso";
        } else {
            valorIndice = "Obesidad";
        }
        return valorIndice;
    }
}
