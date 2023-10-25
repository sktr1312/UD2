package bucles;

import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        // Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El
        // jugador tendrá que introducir la solución de la suma de dos números
        // aleatorios comprendidos entre 1 y 100. Mientras la solución sea correcta, el
        // juego continuará. En caso contrario, el programa terminará y mostrará el
        // número de operaciones realizadas correctamente. Amplía el programa para que
        // muestre el número de aciertos al terminar.
        // (int) (1 + max + min) math.random() + min

        final int NUM_MAXIMO = 100;
        int numSuma1;
        int numSuma2; 
        int numSolucionUsuario;
        int numSolucion;
        int contadorAciertos = 0;
        int errors = 0;
        boolean falloUsuario = false;
        Scanner sc = new Scanner(System.in);

        do {
            numSuma1 = (int) (Math.random() * NUM_MAXIMO + 1);
            numSuma2 = (int) (Math.random() * NUM_MAXIMO + 1);
            numSolucion = numSuma1 + numSuma2;
           
            System.out.println("Introduzca la solucion de la suma de " + numSuma1 + " + " + numSuma2);
            numSolucionUsuario = sc.nextInt();


            if (numSolucionUsuario == numSolucion) {
                contadorAciertos++;
            } else {
                System.out.println("Error!! el resultado era: " + numSolucion);
                errors++;
                falloUsuario = errors >= 3? true : false;
            }


        } while (!falloUsuario);

        sc.close();
        System.out.println("Has conseguido acertar " + contadorAciertos + " veces.");

    }
}
