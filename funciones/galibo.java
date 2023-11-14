package funciones;

import java.util.Scanner;

public class galibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroDePuentes;
        int numeroCarriles;
        int alturaPorCarril = 0;
        int alturamaxima = 0;
        int maximogalibo = 800;

        System.out.println("Introduzca el numero de Puentes o tuneles: ");
        numeroDePuentes = sc.nextInt();
        for (int i = 0; i < numeroDePuentes; i++) {
            System.out.println("Introduzca el numero de carriles del puente " + (i + 1) + ": ");
            numeroCarriles = sc.nextInt();
            for (int j = 0; j < numeroCarriles; j++) {
                System.out.println("Introduzca la altura del carril" + (j + 1) + ": ");
                alturaPorCarril = sc.nextInt();
                if (alturaPorCarril > alturamaxima) {
                    alturamaxima = alturaPorCarril;
                }
            }
            if(alturamaxima <= maximogalibo){
                maximogalibo = alturamaxima;
            }
          alturamaxima = 0;
        }
        System.out.println(maximogalibo);

    }
}