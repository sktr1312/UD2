package bucles;

import java.util.Scanner;

public class E0304 {
    public static void main(String[] args) {
        // E0304. Un centro de investigación de la flora urbana necesita una aplicación
        // que muestre cuál es el árbol más alto. Para ello introducirá por teclado la
        // altura (en centímetros) de cada árbol (terminando la introducción de datos
        // cuando se utilice el -1 como altura). Los árboles se identifican mediante
        // etiquetas con números únicos correlativos, comenzando en 0. Diseñar una
        // aplicación que resuelva el problema planteado.

        int alturaArbol = 0, codArbol = 0, alturaMayor = 0, arbolMasAlto = -1;
        Scanner sc = new Scanner(System.in);

        while (alturaArbol != -1) {
            System.out.print("Altura del arbol " + codArbol + ": (-1 para salir del programa) ");
            alturaArbol = sc.nextInt();

            if (alturaArbol > alturaMayor) {
                alturaMayor = alturaArbol;
                arbolMasAlto = codArbol;
            }
            codArbol++;

        }
        sc.close();
        if (arbolMasAlto != -1) {
            System.out.println("El arbol mas alto será el arbol: " + arbolMasAlto + " con " + alturaMayor + " centimetros.");
        } else {
            System.out.println("No has introducido ningun arbol.");
        }
    }
}
