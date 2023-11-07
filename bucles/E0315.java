package bucles;

import java.util.Scanner;

public class E0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduzca el numro de veces que quiere que se pinte *: ");
        n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
