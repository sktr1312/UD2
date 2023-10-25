package ejercicios;

import java.util.Scanner;

public class factura {
    public static void main(String[] args) {
        final double DESCUENTO = 0.05;
        final double IVA = 0.21;
        final double PRECIO_MIN_DESCUENTO = 100;
        double precioProducto;
        int cantidadProducto;
        double precioIva;
        double precioFinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        precioProducto = sc.nextDouble();
        System.out.println("introduce la cantidad de producto: ");
        cantidadProducto = sc.nextInt();
        sc.close();

       precioIva = (precioProducto * IVA) + precioProducto;

        if (cantidadProducto == 0) {
            System.out.println("la cantidad de producto no puede ser " + cantidadProducto);

        } else {
            if (precioIva > PRECIO_MIN_DESCUENTO) {
                precioIva =  precioIva - (precioIva * DESCUENTO) ;
                precioFinal = precioIva * cantidadProducto;
                System.out.println("El precio final será: " + precioFinal + " euros.");
            } else {
                precioFinal = precioIva * cantidadProducto;
                System.out.println("El precio final será: " + precioFinal + " euros");

            }
        }

    }
}
