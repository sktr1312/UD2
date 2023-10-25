package ejercicios;

import java.util.Scanner;

public class mayoramenor {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres numeros a continuacion: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        sc.close();

        if (num1 >= num2 && num2 >= num3 && num1 >= num3) {
            System.out.printf("%.2f, %.2f, %.2f", num1, num2, num3);
        } else {
            if (num1 >= num2 && num2 <= num3 && num1 >= num3) {
                System.out.printf("%.2f, %.2f, %.2f", num1, num3, num2);
            } else {
                if (num2 >= num1 && num1 >= num3 && num2 >= num3) {
                    System.out.printf("%.2f, %.2f, %.2f", num2, num1, num3);
                } else {
                    if (num2 >= num1 && num1 <= num3 && num2 >= num3) {
                        System.out.printf("%.2f, %.2f, %.2f", num2, num3, num1);
                    } else {
                        if (num3 >= num1 && num1 >= num2 && num3 >= num2) {
                            System.out.printf("%.2f, %.2f, %.2f", num3, num1, num2);
                        } else {
                            System.out.printf("%.2f, %.2f, %.2f", num3, num2, num1);
                        }
                    }
                }

            }
        }
    }
}