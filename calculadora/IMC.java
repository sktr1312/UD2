package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoUsuario = 0;
        int alturaUsuario = 0;
        boolean entradaCorrecta;
        entradaCorrecta = false;

        do {
            try {
                do {
                    System.out.println("Introduzca el peso en Kg: ");
                    pesoUsuario = sc.nextDouble();
                    System.out.println("Introduzca su altura en cm: ");
                    alturaUsuario = sc.nextInt();
                    sc.close();
                } while (alturaUsuario < 50 || alturaUsuario > 250 && pesoUsuario < 20 || pesoUsuario > 300);
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no es correcto");
            }
        } while (!entradaCorrecta);

        double indiceMasa = imc(pesoUsuario, alturaUsuario);
        System.out.println(valorImc(indiceMasa));

    }

    static double imc(double pesoUsuario, int alturaUsuario) {
        double indiceMasa;

        indiceMasa = pesoUsuario / Math.pow((alturaUsuario / 100), 2);
        return indiceMasa;
    }

    static String valorImc(double indiceMasa) {
        String valorIndice;
        if (indiceMasa < 18.50) {
            valorIndice = "-Bajo peso";
        } else if (indiceMasa < 24.99) {
            valorIndice = "Normal";
        } else if (indiceMasa < 30) {
            valorIndice = "Sobrepeso";
        } else {
            valorIndice = "Obesidad";
        }
        return valorIndice;
    }
}
