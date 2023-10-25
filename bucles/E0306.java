package bucles;

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un numero a contar: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        sc.close();

    }
}
