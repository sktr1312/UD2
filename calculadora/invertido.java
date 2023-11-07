package calculadora;

public class invertido {
    public static void main(String[] args) {
        int numero = 12345; // Reemplaza esto con el número que desees invertir
        int numeroInvertido = invertirNumero(numero);

        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: " + numeroInvertido);
    }

    // Método para invertir un número
    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }

        return numeroInvertido;
    }
}


