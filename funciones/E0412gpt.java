package funciones;

import java.util.Scanner;

public class E0412gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            long resultado = calcularFibonacci(n);
            System.out.println("El " + n + "-ésimo término de Fibonacci es: " + resultado);
        }
    }

    static long calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        long temp;

        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
