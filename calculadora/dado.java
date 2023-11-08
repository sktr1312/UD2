package calculadora;

public class dado {
    static final int NUM_LANZAMIENTOS = 1000;
    static final int CARAS_DADO = 6;

    public static void main(String[] args) {
        int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int resultadoLanzamiento = (int) (Math.random() * 6) + 1;
            switch (resultadoLanzamiento) {
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
                    break;
            }
        }

        System.out.println("Estadísticas de lanzamiento del dado:");
        System.out.println("-------------------------------------");
        System.out.println("|     Cara 1: " + cara1 + " veces " + cara1 / 10.0 + "%       |");
        System.out.println("|     Cara 2: " + cara2 + " veces " + cara2 / 10.0 + "%       |");
        System.out.println("|     Cara 3: " + cara3 + " veces " + cara3 / 10.0 + "%       |");
        System.out.println("|     Cara 4: " + cara4 + " veces " + cara4 / 10.0 + "%       |");
        System.out.println("|     Cara 5: " + cara5 + " veces " + cara5 / 10.0 + "%       |");
        System.out.println("|     Cara 6: " + cara6 + " veces " + cara6 / 10.0 + "%       |");
        System.out.println("-------------------------------------");
    }
}
