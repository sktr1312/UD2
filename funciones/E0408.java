package funciones;

public class E0408 {
    public static void main(String[] args) {
        
    }

    static double calculadora(double operando1, double operando2, int operacion){
        double resultado = 0;
        
        switch (operacion) {
            case 1 -> resultado = operando1 + operando2;
            case 2 ->  resultado = operando1 - operando2;
            case 3 ->  resultado = operando1 / operando2;
            case 4 ->  resultado = operando1 * operando2;
            default -> System.out.println("Operacion no valida");
        }
        return resultado;
    }

}
