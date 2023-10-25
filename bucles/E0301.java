package bucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
            // Declaración de variables y constantes
            int numero;
        
            // Entrada de datos
            Scanner sc = new Scanner(System.in);
        
            // Entrada de datos
            System.out.println("Introduce un número (0 para salir): ");
            numero = sc.nextInt();
        
            // Proceso
            while (numero != 0) {
                // Operaciones            
                if (numero % 2 == 0) {
                    System.out.print("Es par. ");
                } else {
                    System.out.print("Es impar. ");
        
                }
        
                if (numero < 0) {
                    System.out.print("Es negativo. ");
                } else if (numero > 0) {
                    System.out.print("Es positivo. ");
                } else {
                    System.out.println("Es cero. ");
                }
        
                System.out.println("Su cuadrado es " +  (int) Math.pow(numero, 2));
        
                System.out.println("Introduce un número (0 para salir): ");
                numero = sc.nextInt();
            } // while
            sc.close();
        }
        
    }

