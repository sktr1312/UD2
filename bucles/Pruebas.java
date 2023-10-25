package bucles;

public class Pruebas {
    public static void main(String[] args) {
        int i = 1;

        while( i <= 3) {
            System.out.println(i);
            i++;

        }
        
        // no se ejecuta
        while (i < 0) {
            System.out.println(i);
        }

        // bucle infinito
        while (1 <= 5) {
            System.out.println(i);

        }
    }
}
