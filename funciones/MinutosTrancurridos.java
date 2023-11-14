package funciones;

public class MinutosTrancurridos {

    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        int diferenciaTiempo = 0;
        boolean horaCorrecta = horaCorrecta(horaA, minutoA, horaB, minutoB);

        if (horaCorrecta == false) {
            diferenciaTiempo = -1;
        } else if (horaA * 60 + minutoA >= horaB * 60 + minutoB) {
            diferenciaTiempo = (horaA * 60 + minutoA) - (horaB * 60 + minutoB);
        } else if (horaA * 60 + minutoA <= horaB * 60 + minutoB ) {
            diferenciaTiempo = (horaB * 60 + minutoB) - (horaA * 60 + minutoA);
        }


        return diferenciaTiempo;
    }

    static boolean horaCorrecta(int horaA, int minutoA, int horaB, int minutoB) {
        boolean horasCorrecta;

        if (horaA < 0 || horaA > 23) {
            horasCorrecta = false;
        } else if (horaB < 0 || horaB > 23) {
            horasCorrecta = false;
        } else if (minutoA < 0 || minutoA > 59) {
            horasCorrecta = false;
        } else if (minutoB < 0 || minutoB > 59) {
            horasCorrecta = false;
        } else {
            horasCorrecta = true;
        }
        return horasCorrecta;

    }
}
