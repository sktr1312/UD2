package funciones;

import java.util.Scanner;

public class E0403 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double radio = sc.nextDouble();
    double area = sc.nextDouble();
      System.out.println( areaCilindro(radio, area));
        
    }

    static double areaCilindro(double radio, double altura) {
        double area;
        area = 2 * Math.PI * radio * (altura + radio);
        return area;
    }
}
