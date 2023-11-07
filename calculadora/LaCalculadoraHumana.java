package calculadora;

import java.util.Scanner;

public class LaCalculadoraHumana {
    public static void main(String[] args) {
        final int MAX_FALLOS_PERMITIDOS = 5;
        final int SEGUNDOS_MAXIMOS = 60000;
        final int OPERACIONES_ACERTADAS = 7;
        final int VALOR_MAX_OPERACIONES = 200;
        final int VALOR_MIN_OPERACIONES = 0;

        Scanner sc = new Scanner(System.in);
        int respuestaUsuario;
        int aleatorio1 = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
        int fallos = 0;
        int aciertos = 0;
        int resultadoEsperado = 0;
        int segundoOperando;

        Thread temporizador = new Thread(() -> {
            try {
                Thread.sleep(SEGUNDOS_MAXIMOS); // 60 segundos
                System.out.println("Tiempo agotado. Juego terminado.");
                System.exit(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        temporizador.start();

        while (aciertos < OPERACIONES_ACERTADAS && fallos < MAX_FALLOS_PERMITIDOS) {
            int numOperador = (int) (Math.random() * 4 + 1);
            char operador = escogerOperador(numOperador);

            if (aciertos == 0) {
                segundoOperando = generarAleatorio(operador, VALOR_MAX_OPERACIONES, VALOR_MIN_OPERACIONES, aleatorio1);
                System.out.print("Operación " + (aciertos + 1) + ": ");
                System.out.print(aleatorio1 + " " + operador + " " + segundoOperando + " = ");
                resultadoEsperado = realizarOperacion(aleatorio1, segundoOperando, operador);

            } else {
                segundoOperando = generarAleatorio(operador, VALOR_MAX_OPERACIONES, VALOR_MIN_OPERACIONES,
                        resultadoEsperado);
                System.out.print("Operación " + (aciertos + 1) + ": ");
                System.out.print(resultadoEsperado + " " + operador + " " + segundoOperando + " = ");
                resultadoEsperado = realizarOperacion(resultadoEsperado, segundoOperando, operador);
            }
            respuestaUsuario = sc.nextInt();

            if (respuestaUsuario == resultadoEsperado) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
                fallos++;
            }
        }
        sc.close();

        if (aciertos == OPERACIONES_ACERTADAS) {
            System.out.println("Enorabuena, has acertado todas las operaciones");
            System.exit(0);
        }
    }

    static char escogerOperador(int numOperador) {

        char operador = '0';

        switch (numOperador) {

            case 1 -> {
                operador = '+';
            }

            case 2 -> {
                operador = '-';
            }

            case 3 -> {
                operador = '*';
            }

            case 4 -> {
                operador = '/';
            }
        }
        return (operador);

    }

    static int generarAleatorio(char operador, int VALOR_MAX_OPERACIONES, int VALOR_MIN_OPERACIONES,
            int primerOperando) {

        int aleatorio = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
        switch (operador) {
            case '+' -> {
                while (primerOperando + aleatorio >= VALOR_MAX_OPERACIONES) {
                    aleatorio = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
                }
            }

            case '-' -> {
                while (primerOperando - aleatorio <= VALOR_MIN_OPERACIONES) {
                    aleatorio = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
                }
            }
            case '*' -> {
                while (primerOperando * aleatorio >= VALOR_MAX_OPERACIONES) {
                    aleatorio = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
                }
            }
            case '/' -> {
                while (primerOperando % aleatorio != 0) {
                    aleatorio = (int) (Math.random() * VALOR_MAX_OPERACIONES + 1);
                }
            }
        }
        return aleatorio;
    }

    private static int realizarOperacion(int a, int b, char operador) {

        int resultado = 0;

        switch (operador) {
            case '+' -> {
                resultado = a + b;
            }

            case '-' -> {
                resultado = a - b;
            }

            case '*' -> {
                resultado = a * b;
            }

            case '/' -> {
                resultado = a / b;
            }
        }
        return resultado;
    }
}