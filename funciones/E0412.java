package funciones;

import java.util.Scanner;

public class E0412 {
    public static void main(String[] args) {
        // Diseñar una función recursiva que calcule el enésimo término de la serie de
        // Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores
        // anteriores de la serie, es decir:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fibonacci(n));
    }

    static int Fibonacci(int n) {
        int resultado = 1;
        
        if (n == 1) {
            resultado = 1;
        } else if (n == 0) {
            resultado = 0;
        } else {
    
            resultado = Fibonacci(n - 1) + Fibonacci(n - 2);
        }

        return resultado;
    }
}
