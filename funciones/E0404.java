package funciones;

import java.util.Scanner;

public class E0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduzca el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el numero 2: ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 == num2) {
            System.out.println("Los numeros deben ser diferentes");
        } else {
            System.out.println("El numero mayor es: " + valorMayor(num1, num2));
        }
    }

    static int valorMayor(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
