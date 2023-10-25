package funciones;

import java.util.Scanner;

public class E0406 {
   public static void main(String[] args) {
    // Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
    Scanner sc = new Scanner(System.in);
    int num1;

    System.out.println("Introduzca el numero: ");
    num1 = sc.nextInt();

    System.out.println(esPrimo(num1));

} 

static boolean esPrimo(int num1){
    boolean primo = true;
    int i = 2;
    while (i <= num1/2 && primo) {
        if (num1 % i == 0) {
            primo = false;
        }
        i++;
    }
return primo;
}
}
