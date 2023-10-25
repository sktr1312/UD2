package bucles;

import java.util.Scanner;

public class E0304b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroArbol = 0;
        int arbolMasAlto = -1;
        int alturaMasAlta = 0;
        int altura = 0;

        System.out.println("Introduce la altura de cada árbol (en centímetros) y termina con -1:");
        
        while (altura != -1) {
            System.out.print("Altura del árbol " + numeroArbol + ": ");
            altura = scanner.nextInt();
            
            // if (altura == -1) {
                // break;
            // }
            
            if (altura > alturaMasAlta) {
                alturaMasAlta = altura;
                arbolMasAlto = numeroArbol;
            }
            
            numeroArbol++;
        }
        
        if (arbolMasAlto == -1) {
            System.out.println("No se introdujeron alturas válidas.");
        } else {
            System.out.println("El árbol más alto es el número " + arbolMasAlto + " con una altura de " + alturaMasAlta + " centímetros.");
        }
        
        scanner.close();
    }
}

    

