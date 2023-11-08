package calculadora;

public class backup {
    double indiceMasa = imc(pesoUsuario, alturaUsuario);
        System.out.println(valorImc(indiceMasa));

    }

    static double imc(double pesoUsuario, int alturaUsuario) {
        double indiceMasa;

        indiceMasa = pesoUsuario / Math.pow((alturaUsuario / 100), 2);
        return indiceMasa;
    }

    static String valorImc(double indiceMasa) {
        String valorIndice;
        if (indiceMasa < 18.50) {
            valorIndice = "-Bajo peso";
        } else if (indiceMasa < 24.99) {
            valorIndice = "Normal";
        } else if (indiceMasa < 30) {
            valorIndice = "Sobrepeso";
        } else {
            valorIndice = "Obesidad";
        }
        return valorIndice;
    }
}

}
